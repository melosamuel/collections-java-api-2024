package main.java.list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList{
    private List<Task> taskList;

    public TaskList(){
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description){
        this.taskList.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task> tasksToRemove = new ArrayList<>();

        for(Task t: this.taskList){
            if(t.getDescription().equalsIgnoreCase(description)){
                tasksToRemove.add(t);
            }
        }

        this.taskList.removeAll(tasksToRemove);
    }

    public int getTotalTasksNumber(){
        return taskList.size();
    }

    public void getTasksDescription(){
        System.out.println(this.taskList);
    }

    public List<Task> getTaskList(){
        return this.taskList;
    }

    public void setTaskList(List<Task> taskList){
        this.taskList = taskList;
    }
}