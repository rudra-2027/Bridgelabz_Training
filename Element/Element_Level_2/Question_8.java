package Element_Level_2;
//Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
//Hint => 
//Create variables a, b, and c of int data type.
//Take user input for a, b, and c.
//Compute 3 integer operations and assign the result to a variable
//Finally, print the result and try to understand operator precedence.
//I/P => fee, discountPrecent
//O/P => The results of Int Operations are ___, ___, and ___
//Similarly, write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;

public class Question_8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = a + b * c;
        double e = a * b + c;
        double f = c + a / b;
        double g = a % b + c;

        System.out.println("The results of Double Operations are " + d + ", " + e + ", " + f + ", " + g);
    }

}
