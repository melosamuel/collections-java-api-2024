package main.java.list.Search;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    private List<Integer> numbers;

    public SumNumbers() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public int sum(){
        if(numbers.isEmpty()) return 0;
        int total = 0;
        for(int n: numbers) total += n;

        return total;
    }

    public int getLargestNumber(){
        if(numbers.isEmpty()) return 0;
        int largestNumber = Integer.MIN_VALUE;
        for(int n: numbers) if(n > largestNumber) largestNumber = n;

        return largestNumber;
    }

    public int getLowestNumber(){
        if(numbers.isEmpty()) return 0;
        int lowestNumber = Integer.MAX_VALUE;
        for(int n: numbers) if(n < lowestNumber) lowestNumber = n;

        return lowestNumber;
    }

    public void showNumbers(){
        System.out.println(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
