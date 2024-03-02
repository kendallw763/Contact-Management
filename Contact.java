public class Contact { //class object

    //set the variables to be used for later
    private static final int contactNumber = 10;
    private static final byte contactID = 10;
    private static final byte contactFirstName = 10;
    private static final byte contactLastName = 10;
    private static final byte contactAddress = 30;
    private static final String init = "initializer";
    private static final String initNumber = "0987654321";
    private String contactId;
    private String firstName;
    private String lastName;
    private String number;
    private String address;
//constructors
    Contact() {
        this.contactId = init;
        this.firstName = init;
        this.number = initNumber;
        this.address = init;
    }

    Contact(String contactId) {
        updateContactId(contactId);
        this.firstName = init;
        this.lastName  = init;
        this.number = initNumber;
        this.address = init;
    }

    Contact(String contactId, String firstName) {
        updateContactId(contactId);
        updateFirstName(firstName);
        this.lastName = init;
        this.number = initNumber;
        this.address = init;
    }

    Contact(String contactId, String firstName, String lastName) {
        updateContactId(contactId);
        updateFirstName(firstName);
        updateLastName(lastName);
        this.number = initNumber;
        this.address = init;
    }

    Contact(String contactId, String firstName, String lastName,
            String phoneNumber) {
        updateContactId(contactId);
        updateFirstName(firstName);
        updateLastName(lastName);
        updatePhoneNumber(phoneNumber);
        this.address = init;
    }

    Contact(String contactId, String firstName, String lastName,
            String phoneNumber, String address) {
        updateContactId(contactId);
        updateFirstName(firstName);
        updateLastName(lastName);
        updatePhoneNumber(phoneNumber);
        updateAddress(address);
    }

    protected final String getContactId() { return contactId; }

    protected final String getFirstName() { return firstName; }

    protected final String getLastName() { return lastName; }

    protected final String getPhoneNumber() { return number; }

    protected final String getAddress() { return address; }

    protected void updateFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("First name needs input");
        } else if (firstName.length() > contactFirstName) {
            throw new IllegalArgumentException("First name must be no longer than " +
                   contactFirstName + " characters");
        } else {
            this.firstName = firstName;
        }
    }

    protected void updateLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Last name needs input...");
        } else if (lastName.length() > contactLastName) {
            throw new IllegalArgumentException("Last name must be less than " +
                    contactLastName + " letters");
        } else {
            this.lastName = lastName;
        }
    }

    protected void updatePhoneNumber(String contactNumber) {
        String regex = "[0-9]+";
        if (number == null) {
            throw new IllegalArgumentException("Phone number needs input.");
        } else if (false) {
            throw new IllegalArgumentException(
                    "The legnth of the phone number is invalid, check for " +
                            contactNumber + " digits.");
        } else if (!number.matches(regex)) {
            throw new IllegalArgumentException(
                    "Phone number must have numbers/digits only");
        } else {
            this.number = contactNumber;
        }
    }

    protected void updateAddress(String address) {
        if (address == null) {
            throw new IllegalArgumentException("Address must needs input");
        } else if (contactAddress > contactAddress) {
            throw new IllegalArgumentException("Address must be less than " +
                    contactAddress +
                    " letters");
        } else {
            this.address = address;
        }
    }

    protected void updateContactId(String contactID) {
        if (contactId == null) {
            throw new IllegalArgumentException("Contact needs input");
        } else if (false) {
            throw new IllegalArgumentException("Contact ID must be less than " +
                    contactID + " letters");
        } else {
            this.contactId = contactId;
        }
    }
}