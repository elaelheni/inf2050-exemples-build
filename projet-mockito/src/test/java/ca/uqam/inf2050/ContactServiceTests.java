package ca.uqam.inf2050;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import org.mockito.junit.jupiter.MockitoExtension;

import ca.uqam.inf2050.NotificationService.ContactEvent;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ContactServiceTests {

  @Mock SequenceService sequenceService;
  @Mock NotificationService notificationService;
  @Mock ContactRepository contactRepository;
  @Captor ArgumentCaptor<Contact> contactCaptor;
  @Captor ArgumentCaptor<ContactEvent> contactEventCaptor;

  @InjectMocks ContactService contactService;

  @Test
  void creates_a_contact() {
    var name = "Alice";
    var email = "alice@wonderland";
    when(sequenceService.getNext(anyString())).thenReturn(1L);

    var aliceContact = contactService.createNew(name, email);

    assertEquals((Long) 1L, aliceContact.getId());
    assertEquals(name, aliceContact.getName());
    assertEquals(email, aliceContact.getEmail());
  }

  @Test
  void updates_a_contact() {
    var aliceContact = new Contact(1L, "Alice", "alice@wonderland");
    when(contactRepository.update(any())).thenReturn(aliceContact);
    doNothing().when(notificationService).emit(any(), any());

    var updated = contactService.update(aliceContact);

    assertEquals(aliceContact, updated);

    verify(contactRepository, times(1)).update(any());
    verify(notificationService, times(1)).emit(contactEventCaptor.capture(), contactCaptor.capture());
    assertEquals(ContactEvent.UPDATED, contactEventCaptor.getValue());
    assertEquals(aliceContact, contactCaptor.getValue());
  }
}
