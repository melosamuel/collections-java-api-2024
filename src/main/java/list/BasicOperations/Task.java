package main.java.list.BasicOperations;

public class Task{
  private String description;

  public Task(String description){
    this.description = description;
  }

  public String getDescription(){
    return this.description;
  }

  public void setDescription(String description){
    this.description = description;
  }

  @Override
  public String toString(){
    return this.description;
  }
}