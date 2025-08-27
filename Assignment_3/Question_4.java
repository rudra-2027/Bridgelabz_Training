package Assignment_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Problem 4: Date Comparison Write a program that:
//➢ Takes two date inputs and compares them to check if the first date is before, after,
//or the same as the second date.
//Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate
public class Question_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        
        System.out.print("Enter first date (dd-MM-yyyy): ");
        String firstDate = sc.nextLine();
        LocalDate date1 = LocalDate.parse(firstDate, formatter);

     
        System.out.print("Enter second date (dd-MM-yyyy): ");
        String secondDate = sc.nextLine();
        LocalDate date2 = LocalDate.parse(secondDate, formatter);

        
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
	    }
	}

}
