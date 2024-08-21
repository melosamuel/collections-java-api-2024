package main.java.set.Sorting;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
  private long code;
  private String name;
  private double price;
  private int quantity;

  public Product(long code, String name, double price, int quantity) {
    this.code = code;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public int compareTo(Product p) {
    return this.name.compareToIgnoreCase(p.getname());
  }

  public long getcode() {
    return this.code;
  }

  public String getname() {
    return this.name;
  }

  public double getprice() {
    return this.price;
  }

  public int getquantity() {
    return this.quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product Product)) return false;
    return this.getcode() == Product.getcode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getcode());
  }

  @Override
  public String toString() {
    return "Product{" +
        "code=" + this.code +
        ", name='" + this.name + '\'' +
        ", price=" + this.price +
        ", quantity=" + this.quantity +
        '}';
  }
}

class PriceComparator implements Comparator<Product> {
  @Override
  public int compare(Product p1, Product p2) {
    return Double.compare(p1.getprice(), p2.getprice());
  }
}








