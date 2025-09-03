package Class_And_Object_Level_1;
//Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
public class Book {
	String title; 
	String author; 
	Double price;
	Book(String title,String author, Double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayBookDetails() {
		System.out.println("Book Title is: "+title);
		System.out.println("Book Author is: "+author);
		System.out.println("Book Price is: "+price);


	}
	
}
