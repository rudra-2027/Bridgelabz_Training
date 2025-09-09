package Control_Flow_Level_1;
//Rewrite program 14 using for loop
//Hint => 
//Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 

import java.util.Scanner;

public class Question_15 {
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
