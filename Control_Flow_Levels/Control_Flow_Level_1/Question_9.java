package Control_Flow_Level_1;
//Rewrite program 8 to do the countdown using the for-loop
//Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
//Hint => 
//Create a variable counter to take user inputted value for the countdown.
//Use the while loop to check if the counter is 1
//Inside a while loop, print the value of the counter and decrement the counter.

import java.util.Scanner;

public class Question_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the counter value: ");
		int countdown = sc.nextInt();
		for(int i = countdown ;i>=1;i--) {
			System.out.println(i);
		}
	}

}
