package Object_Modeling;

import java.util.*;
//Problem 4: E-commerce Platform with Orders, Customers, and Products
//Description: Design an e-commerce platform with Order, Customer, and Product classes. Model relationships where a Customer places an Order,
//and each Order contains multiple Product objects.
//Goal: Show communication and object relationships by designing a system where customers communicate through orders, and orders aggregate products.

class Product {
    private String name;
    private double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product pro) {
        products.add(pro);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product p : products) {
            System.out.println(p.getName() + "->" + p.getPrice());
        }
        System.out.println("Total: $" + getTotalPrice());
        System.out.println();
    }
}

class Customer2 {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer2(String name) {
        this.name = name;
    }

    public void placeOrder(Order or) {
        orders.add(or);
    }

    public void displayOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.displayOrder();
        }
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000.0);
        Product phone = new Product("Smartphone", 600.0);
        Product book = new Product("Book", 30.0);

        Customer2 c1 = new Customer2("Sam");

        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(book);

        Order order2 = new Order(102);
        order2.addProduct(phone);

        c1.placeOrder(order1);
        c1.placeOrder(order2);

        c1.displayOrders();
    }
}
