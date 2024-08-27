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
}

class HeightComparator implements Comparator<Person>{

  @Override
  public int compare(Person p1, Person p2) {
    return Double.compare(p1.getHeight(), p2.getHeight());
  }
  
}
