package Assignment_4;

import java.util.Scanner;

//2. Reverse a String
//Problem:
//Write a Java program to reverse a given string without using any built-in reverse
//functions.
public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		for(int i = str.length()-1;i>=0;i--) {
			res+=str.charAt(i);
		}
		System.out.println(res);
	}
}
