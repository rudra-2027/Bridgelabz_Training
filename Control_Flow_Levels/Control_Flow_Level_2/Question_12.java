package Control_Flow_Level_2;

import java.util.Scanner;

//Create a program to find the power of a number.
//Hint => 
//Get integer input for two variables - number and power and check for positive integer
//Create a result variable with an initial value of 1.
//Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result

public class Question_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        if (number >= 0 && power >= 0) {
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(result);
        } else {
            System.out.println("Please enter positive integers.");
        }
	}
}
