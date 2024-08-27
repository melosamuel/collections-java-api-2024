package main.java.set.Search;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    Set<Task> taskSet;

    public TaskList() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String description){
        taskSet.add(new Task(description));
    }

    public void removeTask(String description){
        if(taskSet.isEmpty()) throw new RuntimeException("The Task list is empty");

        Task task = null;

        for(Task t: taskSet){
            if(t.getDescription().equalsIgnoreCase(description)){
                task = t;
                break;
            }
        }

        if(task == null) throw new RuntimeException("Task '" + description + "' not found in the set");

        taskSet.remove(task);
    }

    public void showTasks(){
        System.out.println(taskSet);
    }

    public int countTasks(){
        return taskSet.size();
    }

    public Set<Task> getCompletedTasks(){
        if(taskSet.isEmpty()) throw new RuntimeException("The Task list is empty");

        Set<Task> completedTasks = new HashSet<>();

        for(Task t: taskSet) if(t.isDone()) completedTasks.add(t);

        return completedTasks;
    }

    public Set<Task> getPendingTasks(){
        if(taskSet.isEmpty()) throw new RuntimeException("The Task list is empty");

        Set<Task> pendingTasks = new HashSet<>();

        for(Task t: taskSet) if(!t.isDone()) pendingTasks.add(t);

        return pendingTasks;
    }

    public void setTaskDone(String description){
        if(taskSet.isEmpty()) throw new RuntimeException("The Task list is empty");

        Task task = null;

        for(Task t: taskSet){
            if(t.getDescription().equalsIgnoreCase(description)) {
                task = t;
                break;
            }
        }

        if(task == null) throw new RuntimeException("Task '" + description + "'  not found in the set");

        task.setDone(true);
        taskSet.add(task);
    }

    public void setTaskPeding(String description){
        if(taskSet.isEmpty()) throw new RuntimeException("The Task list is empty");

        Task task = null;

        for(Task t: taskSet){
            if(t.getDescription().equalsIgnoreCase(description)){ 
                task = t;
                break;
            }
        }

        if(task == null) throw new RuntimeException("Task '" + description + "'  not found in the set");

        task.setDone(false);
        taskSet.add(task);
    }

    public void wipeSet(){
        if(taskSet.isEmpty()) if(taskSet.isEmpty()) throw new RuntimeException("The Task list is already empty");

        taskSet.clear();
    }

    public Set<Task> getTaskSet() {
        return taskSet;
    }

    public void setTaskSet(Set<Task> taskSet) {
        this.taskSet = taskSet;
    }
}
