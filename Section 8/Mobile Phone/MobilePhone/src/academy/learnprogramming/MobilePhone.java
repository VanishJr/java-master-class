package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(newContact.getName()) && contact.getPhoneNumber().equals(newContact.getPhoneNumber())) {
                return false;
            }
        }
        myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(oldContact.getName()) && myContacts.get(i).getPhoneNumber().equals(oldContact.getPhoneNumber())) {
                myContacts.set(i, newContact);
                return true;
            }
        }
        return false;
    }

    public int findContact(Contact contact) {
        int index = myContacts.indexOf(contact);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public int findContact(String contact) {
        int index = myContacts.indexOf(contact);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        int i = 0;
        for (Contact contact : myContacts) {
            System.out.println((++i) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
