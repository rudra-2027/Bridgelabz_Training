package Element_Level_1;

import java.util.Scanner;

//Write a program the find the distance in yards and miles for the distance provided by user in feets
//Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//I/P => distanceInFeet
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

public class Question_14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double b = a / 3;
        double c = b / 1760;

        System.out.println("The distance is " + b + " yards and " + c + " miles for " + a + " feet");
    }
}
