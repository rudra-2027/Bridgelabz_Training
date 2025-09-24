package Encapsulation;

import java.util.ArrayList;

/*Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
*/
abstract class Product {
    String productId;
    String name;
    double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    double discountPercentage;
    double taxPercentage;

    public Electronics(String productId, String name, double price, double discountPercentage, double taxPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxPercentage / 100;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: " + calculateTax();
    }
}

class Clothing extends Product implements Taxable {
    double discountPercentage;
    double taxPercentage;

    public Clothing(String productId, String name, double price, double discountPercentage, double taxPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxPercentage / 100;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: " + calculateTax();
    }
}

class Groceries extends Product {
    double discountAmount;

    public Groceries(String productId, String name, double price, double discountAmount) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }
}

public class E_CommercePlatform {
    public static void main(String[] args) {
        Electronics e1 = new Electronics("E101", "Laptop", 50000, 10, 18);
        Clothing e2 = new Clothing("E102", "Shirt", 2000, 15, 12);
        Groceries e3 = new Groceries("E103", "Rice", 1500, 100);
        ArrayList<Product> products = new ArrayList<>();
        products.add(e1);
        products.add(e2);
        products.add(e3);
        for (Product p : products) {
            p.displayDetails();
        }
    }
}
