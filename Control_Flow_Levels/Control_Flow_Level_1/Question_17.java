package Control_Flow_Level_1;

import java.util.Scanner;

//Create a program to find the bonus of employees based on their years of service.
//Hint => 
//Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
//Take salary and year of service in the year as input.
//Print the bonus amount.

public class Question_17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the service year ");
		int year = sc.nextInt();
		System.out.println("Eneter the Salary");
		double salary = sc.nextDouble();
		if(year>5) {
			double hike = salary * 0.05;
			System.out.println("Your Bonus is "+hike);
		}else {
			System.out.println("No bonus. Service must be more than 5 years.");
		}
	}
}
