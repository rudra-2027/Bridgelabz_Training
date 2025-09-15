package Element_Level_2;

import java.util.Scanner;
//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
//Hint => NA
//I/P => unitPrice, quantity
//O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
public class Question_5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = sc.nextInt();

        double c = a * b;

        System.out.println("The total purchase price is INR " + c +
                           " if the quantity " + b + " and unit price is INR " + a);
    }
}
