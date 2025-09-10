package static_this_Level_1;
//Create a Product class to manage shopping cart items with the following features:
//Static:
//○       A static variable discount shared by all products.
//○       A static method updateDiscount() to modify the discount percentage.
//This:
//○       Use this to initialize productName, price, and quantity in the constructor.
//Final:
//○       Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
//Instanceof:
//○       Validate whether an  object is an instance of the Product class before processing its details.

public class Product {
	private static double discount = 0.0;
	private final String productID;
	private String productName;
	private double price;
	private int quantity;
	public Product(String productID, String productName, double price, int quantity) {
	       this.productID = productID;
	       this.productName = productName;
	       this.price = price;
	       this.quantity = quantity;
	       
	}
	  public String getProductID() {
	       return productID;
	   }
	   public String getProductName() {
	       return productName;
	   }
	   public void setProductName(String productName) {
	       this.productName = productName;
	   }
	   public double getPrice() {
	       return price;
	   }
	   public void setPrice(double price) {
	       this.price = price;
	   }
	   public int getQuantity() {
	       return quantity;
	   }
	   public void setQuantity(int quantity) {
	       this.quantity = quantity;
	   }

	  public static void updateDiscount(double newDiscount) {
	       if (newDiscount >= 0.0 && newDiscount <= 100.0) {
	           discount = newDiscount;
	       } else {
	           System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
	       }
	   }
	  public double getDiscountedPrice() {
	       return price - (price * discount / 100);
	   }
	  public void displayProductDetails() {
	       
	       if (this instanceof Product) {
	           System.out.println("Product ID: " + productID);
	           System.out.println("Product Name: " + productName);
	           System.out.println("Price: $" + price);
	           System.out.println("Quantity: " + quantity);
	           System.out.println("Discount: " + discount + "%");
	           System.out.println("Price after Discount: $" + getDiscountedPrice());
	       } else {
	           System.out.println("The object is not an instance of the Product class.");
	       }
	   }
	  public static void main(String[] args) {
		  Product p1 = new Product("P101", "Laptop", 60000, 2);
	        Product p2 = new Product("P102", "Headphones", 2000, 5);

	        
	        Product.updateDiscount(10);
	        p1.displayProductDetails();
	        System.out.println();
	        p2.displayProductDetails();

		
	}

	

}
