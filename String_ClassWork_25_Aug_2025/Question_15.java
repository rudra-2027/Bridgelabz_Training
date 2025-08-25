package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Check if a string contains only digits.
public class Question_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		String res = "";
		for (char c : str.toCharArray()) {
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
				res += c;
			}
		}
		System.out.println(res);
	}

}
