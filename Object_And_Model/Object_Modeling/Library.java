package Object_Modeling;
//Problem 1: Library and Books (Aggregation)
//Description: Create a Library class that contains multiple Book objects. 
//Model the relationship such that a library can have many books, 
//but a book can exist independently (outside of a specific library).
//Tasks:
//Define a Library class with an ArrayList of Book objects.
//Define a Book class with attributes such as title and author.
//Demonstrate the aggregation relationship by creating books and adding them to different libraries.
//Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<Book> books;
	public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
	 public void addBook(Book book) {
	        books.add(book);
	  }
	 public void display() {
		 System.out.println("Books in "+name);
		 for(Book b : books) {
			 System.out.println(b);
		 }
		 System.out.println();
	 }
	 
	 public static void main(String[] args) {
		 	Book b1 = new Book("New Book", "Java the Power");
	        Book b2 = new Book("Friends Are HelpFull", "Thomas");
	        Book b3 = new Book("Alonineess", "Thomas");

	        Library lib1 = new Library("Central Library");
	        Library lib2 = new Library("Community Library");

	       
	        lib1.addBook(b1);
	        lib1.addBook(b2);

	        lib2.addBook(b2); 
	        lib2.addBook(b3);

	       
	        lib1.display();
	        lib2.display();

	        System.out.println("Standalone book: " + b1);
	}


}
class Book{
	private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
    	return "Book Title "+title+ ", Book Author Name "+author;
    }
}
