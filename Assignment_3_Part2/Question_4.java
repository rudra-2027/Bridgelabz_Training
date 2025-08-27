package Assignment_3_Part2;

import java.util.Scanner;

//Fibonacci Sequence Generator:
//○ Write a program that generates the Fibonacci sequence up to a specified number
//of terms entered by the user.
//○ Organize the code by creating a function that calculates and prints the Fibonacci
//sequence.
public class Question_4 {
	 public static void generateFibonacci(int terms) {
	        int first = 0, second = 1;

	        System.out.print("Fibonacci Sequence: ");
	        for (int i = 1; i <= terms; i++) {
	            System.out.print(first + " ");	           
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number : ");
	        int terms = sc.nextInt();

	        if (terms <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            generateFibonacci(terms);
	        }
	    }
	
}
