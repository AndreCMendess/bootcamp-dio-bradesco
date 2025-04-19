package calendarsContact;

import java.util.HashSet;
import java.util.Set;

public class AgendaContact {

    Set<Contact> contacts;

    public AgendaContact() {
        this.contacts = new HashSet<>();
    }

    public void addContact(String name , int number) {
        this.contacts.add(new Contact(name,number));
    }

    public void displayContact() {
        System.out.println(this.contacts);
    }

    public Set<Contact> searchContactByName(String name) {
        Set<Contact> contactsFound = new HashSet<>();
        for(Contact c : this.contacts) {
            if(c.hasSameName(name)) {
                contactsFound.add(c);
            }
        }

        return contactsFound;
    }

    public static void main(String[] args) {
        AgendaContact MyContacts = new AgendaContact();

        
        MyContacts.addContact("Alice", 1111);
        MyContacts.addContact("Bob", 2222);
        MyContacts.addContact("Alice", 3333);
        MyContacts.addContact("Charlie", 4444);

        MyContacts.displayContact();
        Set<Contact> contactsByName = MyContacts.searchContactByName("Alice");
        System.out.println(contactsByName);
    }
    
}
