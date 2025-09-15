package Element_Level_1;
//The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
//Hint => 
//Create a variable named fee and assign 125000 to it.
//Create another variable discountPercent and assign 10 to it.
//Compute discount and assign it to the discount variable.
//Compute and print the fee you have to pay by subtracting the discount from the fee.

public class Question_6 {
	public static void main(String[] args) {
		 double a = 125000;
	        double b = 10;

	        double c = (a * b) / 100;
	        double d = a - c;

	        System.out.println("The discount amount is INR " + c +
	                           " and final discounted fee is INR " + d);
	}
}
