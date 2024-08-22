package main.java.map.Sorting;

public class Event{
  private String name;
  private String attractionName;

  public Event(String name, String attractionName) {
    this.name = name;
    this.attractionName = attractionName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAttractionName() {
    return attractionName;
  }

  public void setAttractionName(String attractionName) {
    this.attractionName = attractionName;
  }

  @Override
  public String toString() {
    return "Event [name=" + name + ", attractionName=" + attractionName + "]";
  }

  
}