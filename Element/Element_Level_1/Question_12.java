package Element_Level_1;
//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
//Hint => Area of a Triangle is ½ * base * height
//I/P => base, height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class Question_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = 0.5 * a * b;
        double d = c * 6.4516;

        System.out.println("The area of the triangle is " + c +
                           " square inches and " + d + " square cm");
	}

}
