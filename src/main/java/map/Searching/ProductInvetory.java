package main.java.map.Searching;

import java.util.HashMap;
import java.util.Map;

public class ProductInvetory {
    private Map<Long, Product> productsInvetory;

    public ProductInvetory() {
        this.productsInvetory = new HashMap<>();
    }

    public void addProduct(long code, String name, int quantity, double price){
        this.productsInvetory.put(code, new Product(name, price, quantity));
    }

    public void showInvetory(){
        System.out.println(this.productsInvetory);
    }

    public double calculateTotalInvetoryValue(){
        if(this.productsInvetory.isEmpty()) return 0d;

        double total = 0d;
        for(Product p: this.productsInvetory.values()) total += p.getPrice();

        return total;
    }

    public Product getMostExpensiveProduct(){
        if(this.productsInvetory.isEmpty()) return null;

        Product mostExpensiveProduct = null;
        double latestPrice = Double.MIN_VALUE;

        for(Product p: this.productsInvetory.values()) if(p.getPrice() >= latestPrice){ 
            mostExpensiveProduct = p;
            latestPrice = p.getPrice();
        }

        return mostExpensiveProduct;
    }

    public Product getCheapestProduct(){
        if(this.productsInvetory.isEmpty()) return null;

        Product cheapestProduct = null;
        double latestPrice = Double.MAX_VALUE;
        
        for(Product p: this.productsInvetory.values()) if(p.getPrice() <= latestPrice){
            cheapestProduct = p;
            latestPrice = p.getPrice();
        }

        return cheapestProduct;
    }

    public Product getProductWithLargestQuantity(){
        if(this.productsInvetory.isEmpty()) return null;

        Product productWithLargestQuantity = null;
        int latestQuantity = 0;

        for(Product p: this.productsInvetory.values()) if(p.getQuantity() >= latestQuantity){
            productWithLargestQuantity = p;
            latestQuantity = p.getQuantity();
        }

        return productWithLargestQuantity;
    }

    public Map<Long, Product> getProductsInvetory() {
        return this.productsInvetory;
    }

    public void setProductsInvetory(Map<Long, Product> productsInvetory) {
        this.productsInvetory = productsInvetory;
    }
}
