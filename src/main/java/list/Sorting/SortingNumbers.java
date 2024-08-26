package main.java.list.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNumbers{
    private List<Integer> list;

    public SortingNumbers(){
        list = new ArrayList<>();
    }

    public void addNumber(int number){
        list.add(number);
    }

    public void ascendentOrder(){
        if(!list.isEmpty()) Collections.sort(list);
        else throw new RuntimeException("The list is empty!");
    }

    public void descendentOrder(){
        if(!list.isEmpty()) Collections.reverse(list);
        else throw new RuntimeException("The list is empty!");
    }

    public void showNumbers(){
        System.out.println(list);
    }
}
