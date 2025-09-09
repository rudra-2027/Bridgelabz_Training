package Constructor_Level_1;
//Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
public class LibraryBook {
	String attributes; 
	String title; 
	String author; 
	Long price; 
	boolean availability;
	public LibraryBook() {
		
	}
	public LibraryBook(
	String title,
	String author, 
	Long price,
	boolean availability)
	{
		this.availability = availability;
		this.title = title;
		this.author  = author;
		this.price = price;
	}
	 public void borrowBook() {
	        if (availability) {
	            availability = false;
	            System.out.println(title + " has been borrowed successfully.");
	        } else {
	            System.out.println(title + " is currently not available.");
	        }
	    }

	   
    public void display() {
        System.out.println("Title: " + title +
                           ", Author: " + author +
                           ", Price: " + price +
                           ", Available: " + availability);
    }

    public static void main(String[] args) {
        
        LibraryBook b1 = new LibraryBook("1984", "Java The Thunder", 299L, true);
        LibraryBook b2 = new LibraryBook();

        b1.display();
        b2.display();

        b1.borrowBook();
        b1.borrowBook(); 
    }
	

}
