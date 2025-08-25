package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;
//Write a custom method to compare two strings without using .equals().

public class Question_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		System.out.print("Enter string 2: ");
		String str2 = sc.nextLine();
		boolean equals = compare(str, str2);
		if (equals) {
			System.out.println("Both Are Equals");
		} else {
			System.out.println("Both Are Different");
		}

	}

	public static boolean compare(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
