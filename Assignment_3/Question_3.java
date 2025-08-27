package Assignment_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Problem 3: Date Formatting Write a program that:
//➢ Displays the current date in three different formats:
//■ dd/MM/yyyy
//■ yyyy-MM-dd
//■ EEE, MMM dd, yyyy
//
//Hint: Use DateTimeFormatter with custom patterns for date formatting.
public class Question_3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1 (dd/MM/yyyy): " + date.format(f1));
        System.out.println("Format 2 (yyyy-MM-dd): " + date.format(f2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + date.format(f3));
    }

}
