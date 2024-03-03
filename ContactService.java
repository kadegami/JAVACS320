//Contact.Service
//Karina Washington
//January 28, 2024
//3-2 Milestone: Contact Service

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        // Ensure the contactId is unique before adding to the map
        if (!contacts.containsKey(contact.getContactId())) {
            contacts.put(contact.getContactId(), contact);
        } else {
            // Handle error (throw an exception, log a message, etc.)
        }
    }

    public void deleteContact(String contactId) {
        // Remove the contact with the specified contactId from the map
        contacts.remove(contactId);
    }

    public void updateContact(Contact updatedContact) {
        // Update the contact in the map based on the contactId
        contacts.put(updatedContact.getContactId(), updatedContact);
    }
}