package Assignment_3_Part2;

import java.util.Scanner;

//
//Factorial Using Recursion:
//○ Write a program that calculates the factorial of a number using a recursive
//function.
//○ Include modular code to separate input, calculation, and output processes.
public class Question_6 {
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n * fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = input(sc);
		System.out.println(fact(n));
		
	}
	public static int input(Scanner sc) {
		System.out.print("Enter the number: ");
		return sc.nextInt();
	}
}
