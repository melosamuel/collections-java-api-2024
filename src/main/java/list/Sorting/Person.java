package main.java.list.Sorting;

public class Person implements Comparable<Person>{
  private String name;
  private int age;
  private double height;

  public Person(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public double getHeight() {
    return this.height;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + this.name + '\'' +
        ", age=" + this.age +
        ", height=" + this.height +
        '}';
  }

  @Override
  public int compareTo(Person p) {
    return Integer.compare(this.age, p.getAge());
  }
}