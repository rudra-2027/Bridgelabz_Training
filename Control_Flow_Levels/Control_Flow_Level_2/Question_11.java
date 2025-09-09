package Control_Flow_Level_2;

import java.util.Scanner;

//Create a program to find all the multiples of a value taken as user input below 100.
//Hint => 
//Get the input value for a variable named value. Check the value is a positive integer and less than 100.
//Run a for loop backward: from i = 100 to i = 1.
//Inside the loop, check if i perfectly divide the value. If true, print the value and continue the loop.

public class Question_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value below 100 ");
		int value = sc.nextInt();
		if (value > 0 && value < 100) {
         
            
            for (int i = 100; i >= 1; i--) {
                if (i % value == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
	}
}
