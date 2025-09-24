package Encapsulation;
/*
 * 5. Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/

abstract class LibraryItem {
    String itemId;
    String title;
    String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

interface Reservable {
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    boolean available = true;
    String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    boolean available = true;
    String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {
    boolean available = true;
    String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            borrower = borrowerName;
            available = false;
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Reservable[] items = {
                new Book("B101", "Java Programming", "Thomas"),
                new Magazine("M202", "Techy", "Charles"),
                new DVD("D303", "Inception", "Thomas")
        };

        for (Reservable item : items) {
            LibraryItem libItem = (LibraryItem) item;

            System.out.println(libItem.getItemDetails());
            System.out.println("Loan Duration: " + libItem.getLoanDuration() + " days");

            item.reserveItem("John Doe");
            System.out.println("Available: " + item.checkAvailability());

        }
    }
}
