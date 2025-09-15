package Element_Level_2;
//Write a program to find the distance in yards and miles for the distance provided by the user in feet
//Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//I/P => distanceInFeet
//O/P => The distance in yards is ___ while the distance in miles is ___

import java.util.Scanner;

public class Question_4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in the feet ");
        double a = sc.nextDouble();

        double b = a / 3;
        double c = b / 1760;

        System.out.println("The distance in yards is " + b + " while the distance in miles is " + c);
    }
}
