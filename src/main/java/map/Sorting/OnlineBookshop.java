package main.java.map.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OnlineBookshop {
    Map<String, Book> books;

    public OnlineBookshop() {
        books = new HashMap<>();
    }

    public void addBook(String link, String title, String author, double price){
        books.put(link, new Book(title, author, price));
    }

    public void removeBook(String title){
        for(Entry<String, Book> entry: books.entrySet()){
            if(entry.getValue().getTitle().equalsIgnoreCase(title)){
                books.remove(entry.getKey());
            }
        }
    }

    public void showBooksByPrice(){
        if(books.isEmpty()) throw new RuntimeException("There are no books in the bookshop");

        List<Map.Entry<String, Book>> booksToSort = new ArrayList<>(books.entrySet());

        Collections.sort(booksToSort, new PriceComparator());
        
        System.out.println(booksToSort);
    }

    public Book getMostExpensiveBook(){
        if(books.isEmpty()) throw new RuntimeException("There are no books in the bookshop");

        Book mostExpensiveBook = null;
        double price = 0d;
        
        for(Entry<String, Book> entry: books.entrySet()){
            if(entry.getValue().getPrice() > price){
                price = entry.getValue().getPrice();
                mostExpensiveBook = entry.getValue();
            }
        }

        return mostExpensiveBook;
    }

    public Book getCheapestBook(){
        if(books.isEmpty()) throw new RuntimeException("There are no books in the bookshop");

        Book cheapestBook = null;
        double price = Double.MAX_VALUE;

        for(Entry<String, Book> entry: books.entrySet()){
            if(entry.getValue().getPrice() < price){
                price = entry.getValue().getPrice();
                cheapestBook = entry.getValue();
            }
        }

        return cheapestBook;
    }

    public void showBooksByAuthor(){
        if(books.isEmpty()) throw new RuntimeException("There are no books in the bookshop");
        
        List<Map.Entry<String, Book>> booksToSort = new ArrayList<>(books.entrySet());
        
        Collections.sort(booksToSort, new AuthorComparator());

        System.out.println(booksToSort);
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<String, Book> books) {
        this.books = books;
    }
}

class PriceComparator implements Comparator<Entry<String, Book>> {

    @Override
    public int compare(Entry<String, Book> b1, Entry<String, Book> b2) {
        return Double.compare(b1.getValue().getPrice(), b2.getValue().getPrice());
    }
}

class AuthorComparator implements Comparator<Entry<String, Book>> {
    @Override
    public int compare(Entry<String, Book> b1, Entry<String, Book> b2){
        return b1.getValue().getAuthor().compareTo(b2.getValue().getAuthor());
    }
}