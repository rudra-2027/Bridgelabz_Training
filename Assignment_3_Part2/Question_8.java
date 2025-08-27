package Assignment_3_Part2;

import java.util.Scanner;

//Temperature Converter:
//○ Write a program that converts temperatures between Fahrenheit and Celsius. ○
//The program should have separate functions for converting from Fahrenheit to
//Celsius and from Celsius to Fahrenheit.
public class Question_8 {
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "C = " + fahrenheit + "F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "F = " + celsius + "C");
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }
	}
}
