package ca.uqam.inf2050;

import ca.uqam.inf2050.NotificationService.ContactEvent;
import lombok.Setter;

@Setter
public class ContactService {

  private SequenceService sequenceService;
  private ContactRepository contactRepository;
  private NotificationService notificationService;

  public Contact createNew(final String name, final String email) {
    final var id = sequenceService.getNext("CONTACT");
    final var created = new Contact(id, name, email);
    return created;
  }

  public Contact update(final Contact toUpdate) {
    final var updated = contactRepository.update(toUpdate);
    notificationService.emit(ContactEvent.UPDATED, updated);
    return updated;
  }
}
