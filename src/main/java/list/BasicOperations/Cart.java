package main.java.list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private List<Item> itemList;

    public Cart(){
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        this.itemList.add(new Item(name, price, quantity));
    }

    public void removeItem(String name){
        List<Item> itemsToRemove = new ArrayList<>();

        for(Item i: this.itemList){
            if(i.getName().equalsIgnoreCase(name)){
                itemsToRemove.add(i);
            }
        }

        this.itemList.removeAll(itemsToRemove);
    }

    public double calculateTotalValue(){
        double total = 0.0;

        for(Item i: this.itemList){
            total += i.getPrice() * i.getQuantity();
        }

        return total;
    }

    public void showItems(){
        System.out.println(itemList);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}