//Contact
//Karina Washington
//January 28, 2024
//3-2 Milestone: Contact Service

public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters for all fields

    // You can generate these using your IDE or write them manually
    // Ensure that you follow the specified requirements for each field

    // Example of a getter:
    public String getContactId() {
        return contactId;
    }

    // Example of a setter:
    public void setContactId(String contactId) {
        // Check if contactId is not null and does not exceed 10 characters
        if (contactId != null && contactId.length() <= 10) {
            this.contactId = contactId;
        } else {
            // Handle error (throw an exception, log a message, etc.)
        }
    }
}