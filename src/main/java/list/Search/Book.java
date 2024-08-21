package main.java.list.Search;

public class Book {
  private String title;
  private String author;
  private int yearRelease;

  public Book(String title, String author, int yearRelease) {
    this.title = title;
    this.author = author;
    this.yearRelease = yearRelease;
  }

  public String getTitle() {
    return title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }

  public int getYearRelease() {
    return this.yearRelease;
  }

  @Override
  public String toString() {
    return "Livro{" +
        "title='" + this.title + '\'' +
        ", author='" + this.author + '\'' +
        ", yearRelease=" + this.yearRelease +
        '}';
  }
}
