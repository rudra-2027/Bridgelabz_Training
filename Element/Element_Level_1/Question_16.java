package Element_Level_1;

import java.util.Scanner;

//Create a program to find the maximum number of handshakes among N number of students.
//Hint => 
//Get integer input for numberOfStudents variable.
//Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
//Display the number of possible handshakes.

public class Question_16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = (a * (a - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + b);
	}
}
