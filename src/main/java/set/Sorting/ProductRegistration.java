package main.java.set.Sorting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
  private Set<Product> productsSet;

  public ProductRegistration() {
    this.productsSet = new HashSet<>();
  }

  public void addProduct(long code, String name, double price, int quantity){
    this.productsSet.add(new Product(code, name, price, quantity));
  }

  public Set<Product> showProductsByName(){
    Set<Product> productsByName = new TreeSet<>(this.productsSet);
    return productsByName;
  }

  public Set<Product> showProductsByPrice(){
    Set<Product> productsByPrice = new TreeSet<>(new PriceComparator());
    productsByPrice.addAll(this.productsSet);
    return productsByPrice;
  }
}
