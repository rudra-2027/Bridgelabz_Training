package Encapsulation;
/*
 * 6. Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.
*/

abstract class FoodItem implements Discountable {
    String itemName;
    double price;
    int quantity;
    double discount;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.discount = 0;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    public String getDiscountDetails() {
        return "Discount applied: " + discount + "%";
    }

    protected double applyDiscountToAmount(double amount) {
        return amount - (amount * discount / 100);
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return applyDiscountToAmount(total);
    }
}

class NonVegItem extends FoodItem {
    double extraCharge;

    public NonVegItem(String itemName, double price, int quantity, double extraCharge) {
        super(itemName, price, quantity);
        this.extraCharge = extraCharge;
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity() + extraCharge;
        return applyDiscountToAmount(total);
    }
}

interface Discountable {
    void applyDiscount(double percentage);

    String getDiscountDetails();
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
                new VegItem("Paneer Butter Masala", 200, 2),
                new NonVegItem("Chicken Biryani", 250, 1, 50)
        };

        for (FoodItem item : order) {
            item.applyDiscount(10);
            System.out.println(item.getItemDetails());
            System.out.println(item.getDiscountDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

        }
    }
}
