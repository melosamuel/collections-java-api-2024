package main.java.set.Search;

import java.util.HashSet;
import java.util.Set;

public class AdressBook {
  private Set<Contact> contactsSet;

  public AdressBook() {
    this.contactsSet = new HashSet<>();
  }

  public void addContact(String name, int number){
    this.contactsSet.add(new Contact(name, number));
  }

  public void showContacts(){
    System.out.println(this.contactsSet);
  }

  public Set<Contact> searchByName(String name){
    Set<Contact> searchedByName = new HashSet<>();
    for(Contact c: this.contactsSet){
      if(c.getName().startsWith(name)){
        searchedByName.add(c);
      }
    }

    return searchedByName;
  }

  public Contact updateContactNumber(String name, int newNumber){
    Contact contactUpdated = null;
    for(Contact c: this.contactsSet){
      if(c.getName().equalsIgnoreCase(name)){
        c.setNumber(newNumber);
        contactUpdated = c;
        break;
      }
    }

    return contactUpdated;
  }
}
