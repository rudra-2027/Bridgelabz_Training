package Control_Flow_Level_1;

import java.util.Scanner;

//Write a program to check if the first, second, or third number is the largest of the three.
//I/P => number1, number2, number3
//O/P => 
//Is the first number the largest? ____
//Is the second number the largest? ___
//Is the third number the largest? ___

public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Number1 is Greater");
		}else if( b>a && b>c) {
			System.out.println("Number2 is Greater");
		}else {
			System.out.println("Number3 is Greater");
		}
	}
}
