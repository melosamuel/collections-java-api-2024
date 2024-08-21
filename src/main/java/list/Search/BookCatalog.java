package main.java.list.Search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
  private List<Book> bookList;

  public BookCatalog() {
    this.bookList = new ArrayList<>();
  }

  public void addBook(String title, String author, int yearRelease){
    this.bookList.add(new Book(title, author, yearRelease));
  }

  public List<Book> searchByAuthor(String author){
    List<Book> booksByAuthor = new ArrayList<>(); 

    if(!this.bookList.isEmpty()){
      for(Book b: this.bookList){
        if(b.getAuthor().equalsIgnoreCase(author)){
          booksByAuthor.add(b);
        }
      }
    }

    return booksByAuthor;
  }

  public List<Book> searchByYearOfRelease(int initialYear, int finalYear){
    List<Book> booksByYearRelease = new ArrayList<>();

    if(!this.bookList.isEmpty()){
      for(Book b: this.bookList){
        if(b.getYearRelease() >= initialYear && b.getYearRelease() <= finalYear){
          booksByYearRelease.add(b);
        }
      }
    }

    return booksByYearRelease;
  }

  public Book searchByTitle(String title){
    Book bookByTitle = null;

    if(!this.bookList.isEmpty()){
      for(Book b: this.bookList){
        if(b.getTitle().equalsIgnoreCase(title)){
          bookByTitle = b;
          break;
        }
      }
    }

    return bookByTitle;
  }
}
