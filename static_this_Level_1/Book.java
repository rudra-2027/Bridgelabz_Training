package static_this_Level_1;
//Create a Book class to manage library books with the following features:
//Static:
//○       A static variable libraryName shared across all books.
//○       A static method displayLibraryName() to print the library name.
//This:
//○       Use this to initialize title, author, and isbn in the constructor.
//Final:
//○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
//Instanceof:
//○       Verify if an object is an instance of the Book class before displaying its details.

public class Book {
	   private static String libraryName;
	   
	   private String title;
	   private String author;
	   private final String isbn; 
	   public Book(String title, String author, String isbn) {
	       this.title = title;
	       this.author = author;
	       this.isbn = isbn;
	   }
	 
	   public static void setLibraryName(String name) {
	       libraryName = name;
	   }
	  public static void displayLibraryName() {
	       System.out.println("Library Name: " + libraryName);
	   }
	  
	   public void displayBookDetails() {
	       
	       if (this instanceof Book) {
	           System.out.println("Title: " + title);
	           System.out.println("Author: " + author);
	           System.out.println("ISBN: " + isbn);
	       } else {
	           System.out.println("The object is not an instance of the Book class.");
	       }
	   }
	   public String getTitle() {
	       return title;
	   }
	   public String getAuthor() {
	       return author;
	   }
	   public String getIsbn() {
	       return isbn;
	   }
public static void main(String[] args) {
	       
	       Book.setLibraryName("Egmore Library");
	       
	       Book.displayLibraryName();
	       
	       Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
	       
	       book1.displayBookDetails();
	   }
}
class Library{
	 

}

