package Class_And_Object_Level_1;
//Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. 
//The MobilePhone class uses attributes to store the phone's characteristics.
//The method is used to retrieve and display this information for each object.

public class MobilePhone {
	String brand;
	String model; 
	Long price;
	
	MobilePhone(String brand, String model, Long price){
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}
	void displayDetails() {
		System.out.println("Mobile Brand is " + brand + "model is "+model+"price is "+price);
	}
	  public static void main(String[] args) {
	        // creating two objects
	        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 75000L);
	        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 80000L);
	        
	        phone1.displayDetails();
	        System.out.println();
	        phone2.displayDetails();
	    }
	
	
}
