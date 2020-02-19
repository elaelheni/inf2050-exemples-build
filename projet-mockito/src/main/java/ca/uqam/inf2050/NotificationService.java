package ca.uqam.inf2050;

public class NotificationService {

  public enum ContactEvent { CREATED, UPDATED, DELETED };

  public void emit(final ContactEvent event, final Contact contact) {
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
