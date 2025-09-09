package Control_Flow_Level_1;
//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
//Hint => 
//Take the user input number and check whether it's a Natural number
//If it's a natural number Compute using formulae as well as compute using while loop
//Compare the two results and print the result

import java.util.Scanner;

public class Question_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n>0) {
			int total = n*(n+1)/2;
			int val = n;
			int sum = 0;
			while(val>0) {
				sum+=val;
				val--;
			}
			
			System.out.println("Sum using formula: " + total);
			System.out.println("Sum using while loop: " + sum);
			if(total == sum) {
				System.out.println("Both are equal ");
				
			}else {
				System.out.println("Both are unequal");
			}
		}
	}
}
