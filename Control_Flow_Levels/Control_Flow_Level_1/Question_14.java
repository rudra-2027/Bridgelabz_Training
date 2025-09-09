package Control_Flow_Level_1;
//Write a Program to find the factorial of an integer entered by the user.
//Hint => 
//For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
//Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
//Using a while loop, compute the factorial.
//Print the factorial at the end.

import java.util.Scanner;

public class Question_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int fact = 1;
		while(n>0) {
			fact = fact*n;
			n--;
		}
		System.out.println("Factor of the number is "+fact);
	}
}
