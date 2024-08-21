package main.java.list.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleSorting {
  private List<Person> peopleList;

  public PeopleSorting() {
    this.peopleList = new ArrayList<>();
  }

  public void addPerson(String name, int age, double height){
    this.peopleList.add(new Person(name, age, height));
  }

  public List<Person> sortByAge(){
    List<Person> sortedByAge = new ArrayList<>(this.peopleList);
    Collections.sort(sortedByAge);

    return sortedByAge;
  }

  public List<Person> sortByHeight(){
    List<Person> sortedByHeight = new ArrayList<>(this.peopleList);
    Collections.sort(sortedByHeight, new HeightComparator());

    return sortedByHeight;
  }

  public List<Person> getPeopleList(){
    return this.peopleList;
  }

  public static void main(String[] args) {
    PeopleSorting peopleSorting = new PeopleSorting();

    peopleSorting.addPerson("Alice", 20, 1.56);
    peopleSorting.addPerson("Bob", 30, 1.80);
    peopleSorting.addPerson("Charlie", 25, 1.70);
    peopleSorting.addPerson("David", 17, 1.56);

    System.out.println(peopleSorting.getPeopleList());

    System.out.println(peopleSorting.sortByAge());

    System.out.println(peopleSorting.sortByHeight());
  }
}

class HeightComparator implements Comparator<Person>{

  @Override
  public int compare(Person p1, Person p2) {
    return Double.compare(p1.getHeight(), p2.getHeight());
  }
  
}
