package main.java.map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class AdressBook {
  private Map<String, Integer> addressBookMap;

  public AdressBook() {
    this.addressBookMap = new HashMap<>();
  }

  public void addContact(String name, int number){
    this.addressBookMap.put(name, number);
  }

  public void removeContact(String name){
    if(!this.addressBookMap.isEmpty()){
      this.addressBookMap.remove(name);
    }
  }

  public void showContacts(){
    System.out.println(this.addressBookMap);
  }

  public Integer searchByName(String name){
    Integer number = null;

    if(!this.addressBookMap.isEmpty()){
      number = this.addressBookMap.get(name);
    }

    return number;
  }

  public static void main(String[] args) {
    AdressBook adressBook = new AdressBook();

    adressBook.addContact("Kayte", 123456);
    adressBook.addContact("John", 5665);
    adressBook.addContact("Carl", 1111111);
    adressBook.addContact("Ane", 654987);
    adressBook.addContact("Mary", 1111111);
    adressBook.addContact("Kayte", 44444);

    adressBook.showContacts();

    adressBook.removeContact("Mary");
    adressBook.showContacts();

    String searchName = "John";
    Integer searchedNumber = adressBook.searchByName(searchName);
    System.out.println(searchName + "'s cellphone number: " + searchedNumber);

    String nonExistentName = "Paul";
    Integer nonExistentNumber = adressBook.searchByName(nonExistentName);
    System.out.println(nonExistentName + "'s cellphone number: " + nonExistentNumber);
  }
}