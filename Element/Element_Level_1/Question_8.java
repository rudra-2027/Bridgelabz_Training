package Element_Level_1;

import java.util.Scanner;

//Create a program to convert distance in kilometers to miles.
//Hint => 
//Create a variable km and assign type as double as in double km;
//Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
//Use Scanner Object to take user input for km as in km = input.nextInt();
//Use 1 mile = 1.6 km formulae to calculate miles and show the output
//I/P => km
//O/P => The total miles is ___ mile for the given ___ km

public class Question_8 {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        double a = sc.nextDouble();
	        double b = a / 1.6;

	        System.out.println("The total miles is " + b + " mile for the given " + a + " km");
	    }

}
