package Element_Level_2;

import java.util.Scanner;

//Write a program to find the side of the square whose parameter you read from the user 
//Hint => Perimeter of the Square is 4 times the side
//I/P => perimeter
//O/P => The length of the side is ___ whose perimeter is ____

public class Question_3 {
	public static void main(String[] args) {
		System.out.println("Enter the Side Of Square ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = a / 4;

        System.out.println("The length of the side is " + b + " whose perimeter is " + a);
    }
}
