package calendarsContactMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContactMap {

    Map<String,Integer> contactsMap;

    public AgendaContactMap() {
        this.contactsMap = new HashMap<>();
    }

    public void addContact(String name , Integer number) {
        this.contactsMap.put(name,number);
    }

    public void removeContact(String name) {
        if(!contactsMap.isEmpty()) {
            contactsMap.remove(name);
        }
    }

    public void displayContact() {
        System.out.println(this.contactsMap);
    }

    public Integer searchContactByName(String name) {
        Integer contact = null;
       if(!contactsMap.isEmpty()) {
         contact = contactsMap.get(name);
       }
       return contact;
    }

    public static void main(String[] args) {
        AgendaContactMap myContacts = new AgendaContactMap();

        
        myContacts.addContact("Alice", 1111);
        myContacts.addContact("Bob", 2222);
        myContacts.addContact("Alice", 912391931);//Put tambem atualiza , entao esse valor substitui o 1111
        myContacts.addContact("Charlie", 4444);

        myContacts.displayContact();
        System.out.println("Numero de contato encontrado: " + myContacts.searchContactByName("Alice"));
    }
    
}
