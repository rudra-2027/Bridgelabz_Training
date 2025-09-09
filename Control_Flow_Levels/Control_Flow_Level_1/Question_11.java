package Control_Flow_Level_1;

import java.util.Scanner;

//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
//Hint => 
//Use infinite while loop as in while (true)
//Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
public class Question_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		while(true) {
			System.out.println("Enter the value: ");
			double useValue = sc.nextDouble();
			if(useValue <= 0) {
				break;
			}
			sum+=useValue;
			
		}
		System.out.println("Total Value is "+sum);
	}
}
