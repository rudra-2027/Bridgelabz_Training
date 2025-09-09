package Control_Flow_Level_1;

import java.util.Scanner;

//Write a program to find the sum of numbers until the user enters 0
//Hint => 
//Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
//Use the while loop to check if the user entered is 0
//If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
//The loop will continue till the user enters zero and outside the loop display the total value

public class Question_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		while(true) {
			System.out.println("Enter the value: ");
			double useValue = sc.nextDouble();
			if(useValue == 0) {
				break;
			}
			sum+=useValue;
			
		}
		System.out.println("Total Value is "+sum);
		
	}

}
