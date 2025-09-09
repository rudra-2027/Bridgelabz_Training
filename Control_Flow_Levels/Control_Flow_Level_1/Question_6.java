package Control_Flow_Level_1;

import java.util.Scanner;

//Write a program to check whether a number is positive, negative, or zero.
//Hint => 
//Get integer input from the user and store it in the number variable.
//If the number is positive, print positive.
//If the number is negative, print negative.
//If the number is zero, print zero. 

public class Question_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n  = sc.nextInt();
		if(n>0) {
			System.out.println("Postive Number");
		}else if(n<0) {
			System.out.println("Negative Number");
		}else {
			System.out.println("Zero");
		}
	}
}
