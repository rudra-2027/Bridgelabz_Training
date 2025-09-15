package Element_Level_1;

import java.util.Scanner;

//Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
//Hint => 
//Create a variable named fee and take user input for fee.
//Create another variable discountPercent and take user input.
//Compute the discount and assign it to the discount variable.
//Compute and print the fee you have to pay by subtracting the discount from the fee.
//I/P => fee, discountPrecent
//O/P => The discount amount is INR ___ and final discounted fee is INR ___

public class Question_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = (a * b) / 100;
        double d = a - c;

        System.out.println("The discount amount is INR " + c +
                           " and final discounted fee is INR " + d);
    }

}
