package Element_Level_1;
//Write a program to find the side of the square whose parameter you read from user 
//Hint => Perimeter of Square is 4 times side
//I/P => perimeter
//O/P => The length of the side is ___ whose perimeter is ____

import java.util.Scanner;

public class Question_13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double b = a / 4;

        System.out.println("The length of the side is " + b + " whose perimeter is " + a);
    }
}
