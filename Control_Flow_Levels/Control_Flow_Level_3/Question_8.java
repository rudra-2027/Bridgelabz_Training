package Control_Flow_Level_3;

import java.util.Scanner;



//Create a program to check if a n taken from the user is a Harshad n.
//Hint => 
//A Harshad n is an integer which is divisible by the sum of its digits. 
//For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
//Get an integer input for the n variable.
//Create an integer variable sum with initial value 0.
//Create a while loop to access each digit of the n.
//Inside the loop, add each digit of the n to sum.
//Check if the n is perfectly divisible by the sum.
//If the n is divisible by the sum, print Harshad n. Otherwise, print Not a Harshad n.



public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n; 
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; 
            sum += digit;             
            n = n / 10;    
        }

        if (original % sum == 0) {
            System.out.println(" a Harshad n");
        } else {
            System.out.println("is Not a Harshad n");
        }
    }
}
