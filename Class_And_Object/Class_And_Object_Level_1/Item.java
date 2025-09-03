package Class_And_Object_Level_1;
//Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.

public class Item {
	
	int itemCode; 
	String itemName; 
	Long price;
	Item(int itemCode , String itemName, Long price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	void displayDetails() {
		System.out.println("Item Id "+ itemCode);
		System.out.println("Item Name "+ itemName);
		System.out.println("Item Price"+ price);
		
	}
	long calcualteQuantity(int quantity) {
		return price*quantity;
	}
	public static void main(String[] args) {
        Item item1 = new Item(101, "Notebook", 50L);

        item1.displayDetails();
        int qty = 5;
        System.out.println("Total cost for quantity " + qty + ": " + item1.calcualteQuantity(qty));
    }
}
