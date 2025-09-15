package Element_Level_2;
//Write a program to take 2 numbers and print their quotient and reminder
//Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
//I/P => number1, number2
//O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a / b;
        int d = a % b;

        System.out.println("The Quotient is " + c + " and Reminder is " + d + " of two number " + a + " and " + b);
    }

}
