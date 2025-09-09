package Control_Flow_Level_1;

import java.util.Scanner;

//Write a program to check if a number is divisible by 5
//I/P => number
//O/P => Is the number ___ divisible by 5? ___

public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%5==0) {
			System.out.print("Number "+n+" is Divisible by 5");
		}else {
			System.out.print("Number "+n+" is not Divisible by 5");
		}
	}
}
