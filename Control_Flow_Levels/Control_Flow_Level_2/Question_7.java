package Control_Flow_Level_2;

import java.util.Scanner;

//Create a program to find the factors of a number taken as user input.
//Hint => 
//Get the input value for a variable named number and check if it is a positive integer.
//Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.
public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		if(n>0) {
			int fact = 1;
			for(int i = 1;i<=n;i++) {
				fact = fact*i;
			}
			System.out.println("Factor of the number is "+fact);
		}
	}
}
