package Class_And_Object_Level_2;

import java.util.HashMap;

//Program to Simulate a Shopping Cart
//Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
//Add an item to the cart.
//Remove an item from the cart.
//Display the total cost.
//Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items 
//and calculating the total cost.

public class CartItem {
	
	String itemName; 
	Double price;
	int quantity;
	static HashMap<String,CartItem> shoopingCart = new HashMap<>();
	CartItem(String itemName, Double price, int quantity ) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
				
	}
	CartItem(){
		
	}
	void addItems(String itemName, Double price, int quantity ) {
		if(shoopingCart.containsKey(itemName)) {
			CartItem exist = shoopingCart.get(itemName);
			exist.quantity += quantity;
			
		}else {
			shoopingCart.put(itemName,new CartItem(itemName, price, quantity));
			
		}
		System.out.println(quantity + " x " + itemName + " added to cart.");
		
	}
	void removeItem(String itemName) {
		if(shoopingCart.containsKey(itemName)) {
			shoopingCart.remove(itemName);
			System.out.println(itemName+" Remove From Cart");
			
		}else {
			System.out.println(itemName+"Not Found in the cart");
			
		}
		
	}
	double totalCost() {
		 double total = 0.0;
	        for (CartItem item : shoopingCart.values()) {
	            total += item.price * item.quantity;
	        }
	        return total;
	}
	void display() {
		if (shoopingCart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in cart:");
            for (CartItem item : shoopingCart.values()) {
                System.out.println(item.itemName + " - " + item.quantity + " x " + item.price);
            }
            System.out.println("Total Cost: " + totalCost());
        }
	}
	public static void main(String[] args) {
		CartItem cart = new CartItem();
        cart.addItems("Apple", 10.0, 3);
        cart.addItems("Banana", 5.0, 6);
        cart.addItems("Apple", 10.0, 2); 
        cart.display();

        cart.removeItem("Banana");
        cart.display();
    }
}
