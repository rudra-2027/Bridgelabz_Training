package Element_Level_2;

import java.util.Scanner;

//Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
//Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
//I/P => base, height
//O/P => The Area of the triangle in sq in is ___ and sq cm is ___
public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height in cm ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = 0.5 * a * b;
        double d = c / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + d + " and sq cm is " + c);
	}

}
