package Element_Level_2;
//Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
//Hint => 
//Create variables a, b, and c of int data type.
//Take user input for a, b, and c.
//Compute 3 integer operations and assign the result to a variable
//Finally, print the result and try to understand operator precedence.
//I/P => fee, discountPrecent
//O/P => The results of Int Operations are ___, ___, and ___

import java.util.Scanner;

public class Question_7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a + b * c;
        int e = a * b + c;
        int f = c + a / b;
        int g = a % b + c;

        System.out.println("The results of Int Operations are " + d + ", " + e + ", " + f + ", " + g);
    }

}
