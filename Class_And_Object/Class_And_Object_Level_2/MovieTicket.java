package Class_And_Object_Level_2;

import java.util.*;

//Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
//Book a ticket (assign seat and update price).
//Display ticket details.
//Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.

public class MovieTicket {
	String movieName; 
	int seatNumber; 
	Double price;
	static HashSet<Integer> bookedSeats = new HashSet<>();
	
	void bookTicket(String movieName,	int seatNumber,	Double price){
		 if (seatNumber < 1 || seatNumber > 50) {
	            System.out.println("Invalid seat number! Please choose between 1 and 50.");
        } else if (bookedSeats.contains(seatNumber)) {
            System.out.println("Seat " + seatNumber + " is already booked. Choose another seat.");
        } else {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            bookedSeats.add(seatNumber);
            System.out.println("Ticket booked successfully for seat " + seatNumber + "!");
        }
	}
	  MovieTicket() {
	        this.movieName = "Not booked";
	        this.seatNumber = -1;
	        this.price = 0.0;
	    }

	
	void displayTicketDetails() {
        if (seatNumber == -1) {
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }
	public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket();
        MovieTicket t2 = new MovieTicket();

        t1.bookTicket("Inception", 12, 250.0);
        t2.bookTicket("Inception", 12, 250.0);
        t2.bookTicket("Inception", 15, 250.0); 

        t1.displayTicketDetails();
        t2.displayTicketDetails();
    }

}
