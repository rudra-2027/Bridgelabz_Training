package Assignment_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

//Problem 2: Date Arithmetic Create a program that:
//➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
//➢ Then subtracts 3 weeks from the result.
//Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
//minusWeeks() methods.
public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date : ");
		String str = sc.nextLine();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(str,format).plusDays(7).plusMonths(1).plusYears(2);
		System.out.println(date);
		
	}
}
