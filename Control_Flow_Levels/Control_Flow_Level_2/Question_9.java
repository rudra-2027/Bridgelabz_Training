package Control_Flow_Level_2;

import java.util.Scanner;

//Create a program to print the greatest factor of a number beside itself using a loop.
//Hint => 
//Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
//Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
//Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
//Display the greatestFactor variable outside the loop

public class Question_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int ans = 1; 

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                ans = i;
                break; 
            }
        }
        System.out.println("Greatest Factor is "+ ans);
	}

}
