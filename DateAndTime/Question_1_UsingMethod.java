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
public class Question_1_UsingMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = getInputDate(sc);
		LocalDate lD =  parseDate(str);
		getDisplayWeek(lD);
		displayDaysBetween(lD);
		displayCurrentDateTime();
		
		
		
		
	}
	public static String getInputDate(Scanner input) {
		System.out.println("Enter a date (dd-MM-yyyy): ");
		return input.nextLine();
		
	}
	public static LocalDate parseDate(String input) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(input,format);
		return date;
	}
	public static void getDisplayWeek(LocalDate date) {
		DayOfWeek week = date.getDayOfWeek();
		System.out.print("Day of the week "+week);
	}
	public static void displayDaysBetween(LocalDate date) {
	
		LocalDate currentDate = LocalDate.now();

		long daysBetween = ChronoUnit.DAYS.between(date, currentDate);
		System.out.println("Days between input date and current date: " + daysBetween);
	}
	public static void displayCurrentDateTime() {
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		System.out.println("Current Date and Time: " + currentDateTime.format(dateTimeFormatter));
		}

}
