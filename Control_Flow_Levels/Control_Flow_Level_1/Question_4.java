package Control_Flow_Level_1;

import java.util.Scanner;

//Write a program to check for the natural number and write the sum of n natural numbers 
//Hint => 
//A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
//A sum of n natural numbers is n * (n+1) / 2 
//I/P => number
//O/P => If the number is a positive integer then the output is
//The sum of ___ natural numbers is ___
//Otherwise 
//The number ___ is not a natural number

public class Question_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		if(n>0) {
			int total = n * (n+1)/2;
			System.out.print("The sum of "+n+" number is "+total);
			
		}else {
			
			System.out.print("The number "+n+" is not a natural number");
		}
	}
}
