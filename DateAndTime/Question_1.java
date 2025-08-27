package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Problem Statement: Create a Java program that:
//● Takes a date input from the user (in the format dd-MM-yyyy).
//● Displays the day of the week for the given date.
//● Calculates and shows the number of days between the given date and the current date.
//● Displays the current date and time in a formatted manner.
public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date (DD-MM-YYY)");
		String str = sc.nextLine();
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(str,dateFormat);
		
		System.out.println(date);
		DayOfWeek week = date.getDayOfWeek();
		System.out.println("Day of the week: "+ week);
		
		
		LocalDate localDate = LocalDate.now();
		long daysbetween = ChronoUnit.DAYS.between(date, localDate);
		System.out.println("Difference Between Current Date and Enter Date: "+daysbetween);
		
		LocalDateTime currentDate = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Current Date and Time: " +currentDate.format(dateTimeFormatter));
		
	}

}
