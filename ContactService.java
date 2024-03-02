import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {

    private String uniqueId;
    private List<Contact> contactList = new ArrayList<>(); //create array

    {
        uniqueId = UUID.randomUUID().toString().substring( //create the random ID
                0, Math.min(toString().length(), 10));
    }


    /*Below are constructors to implement the new contact, from there I can add the first and last names,
    address, and phone number. There is functionality to update and delete the information also. Lastly,
    the ability to create a unique ID for each contact exists.
    *
    */
    public void newContact() { //create a new contact
        Contact contact = new Contact(newUniqueId());
        contactList.add(contact);
    }

    public void newContact(String firstname) {
        Contact contact = new Contact(newUniqueId(), firstname);
        contactList.add(contact);
    }

    public void newContact(String firstname, String lastname) {
        Contact contact = new Contact(newUniqueId(), firstname, lastname);
        contactList.add(contact);
    }

    public void newContact(String firstname, String lastname,
                           String phonenumber) {
        Contact contact =
                new Contact(newUniqueId(), firstname, lastname, phonenumber);
        contactList.add(contact);
    }

    public void newContact(String firstname, String lastname, String phonenumber,
                           String address) {
        Contact contact =
                new Contact(newUniqueId(), firstname, lastname, phonenumber, address);
        contactList.add(contact);
    }

    public void deleteContact(String id) throws Exception {
        contactList.remove(searchForContact(id));
    }

    public void updateFirstName(String id, String firstName) throws Exception {
        searchForContact(id).updateFirstName(firstName);
    }

    public void updateLastName(String id, String lastName) throws Exception {
        searchForContact(id).updateLastName(lastName);
    }

    public void updatePhoneNumber(String id, String phoneNumber)
            throws Exception {
        searchForContact(id).updatePhoneNumber(phoneNumber);
    }

    public void updateAddress(String id, String address) throws Exception {
        searchForContact(id).updateAddress(address);
    }

    protected List<Contact> getContactList() { return contactList; }


    /*
    There is an array below so the contact information may be stored and accessed later.
    This defeats the purpose of redundant code and bad time complexity.
    */

    private String newUniqueId() {
        return uniqueId = UUID.randomUUID().toString().substring(
                0, Math.min(toString().length(), 10));
    }

    private Contact searchForContact(String id) throws Exception {
        int index = 0;
        while (index < contactList.size()) {
            if (id.equals(contactList.get(index).getContactId())) {
                return contactList.get(index);
            }
            index++;
        }
        throw new Exception("The Task does not exist!");
    }
}