package Element_Level_1;
//Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
//Hint => 
//Create a variable number1 and number 2 and take user inputs.
//Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
//I/P => number1, number2
//O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

import java.util.Scanner;

public class Question_11 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();

	        double c = a + b;
	        double d = a - b;
	        double e = a * b;
	        double f = a / b;

	        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
	                           a + " and " + b + " is " + c + ", " + d + ", " + e + ", and " + f);
	    }

}
