package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Check if a string is a palindrome.
public class Question_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean isPal = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isPal = false;
				break;
			}
		}
		if (isPal) {
			System.out.println("Is Palindrome");
		} else {
			System.out.print("Not A Palindrome");
		}

	}

}
