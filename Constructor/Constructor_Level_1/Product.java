package Constructor_Level_1;
//Create a Product class with:
//Instance Variables: productName, price.
//Class Variable: totalProducts (shared among all products).
//Methods:
//An instance method displayProductDetails() to display the details of a product.
//A class method displayTotalProducts() to show the total number of products created.
public class Product {
	String productName;
	Double price;
	
	static int totalProducts = 0;
	public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }
	public void displayDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }

    
    public static void TotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 45000);
        Product p2 = new Product("Smartphone", 20000);
        Product p3 = new Product("Headphones", 1500);

        
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();

        Product.TotalProducts();
    }


}
