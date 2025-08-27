package Assignment_3_Part2;

import java.util.Scanner;

//Maximum of Three Numbers:
//○ Write a program that takes three integer inputs from the user and finds the
//maximum of the three numbers.
//○ Ensure your program follows best practices for organizing code into modular
//functions, such as separate functions for taking input and calculating the
//maximum value.
public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = input(sc,'a');
		int b = input(sc,'b');
		int c = input(sc,'c');
		check(a,b,c);
		
		
	}
	public static int input(Scanner sc,char c) {
		System.out.println("Enter the value of "+c+": ");
		return sc.nextInt();
	}
	public static void check(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("A is Max Number");
		}else if(b>a && b>c) {
			System.out.println("B is Max Number");
		}else if(c>a && c>b) {
			System.out.println("C is Max Number");
		}else {
			System.out.println("All are equal");
		}
	}
}
