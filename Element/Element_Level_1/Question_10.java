package Element_Level_1;

import java.util.Scanner;

//Write a program that takes your height in centimeters and converts it into feet and inches
//Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
//I/P => height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

public class Question_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double b = a / 2.54;
        int c = (int) (b / 12);
        double d = b % 12;

        System.out.println("Your Height in cm is " + a +
                           " while in feet is " + c + " and inches is " + d);
	}
}
