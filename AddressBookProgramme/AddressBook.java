package dayTwo.AddressBookProgramme;

/**
 * Created by student on 28-Jun-16.
 */
public class AddressBook {
    //our address book would have many contacts, in an array
    private Contact[] contacts = new Contact[100];

    //we need to have a counter to use
    int counter = 0;

    public void addNewContact(String firstName, String lastName, Address address, String phoneNumber, String email)
    {
        contacts[counter + 1] = new Contact(new Person(firstName, lastName), address, phoneNumber, email);
        counter++;
    }
    public Contact[] getContacts() {
        return contacts;
    }
}
