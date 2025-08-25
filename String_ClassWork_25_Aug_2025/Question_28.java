package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Detect and remove consecutive duplicate characters (e.g., "aabbcc" → "abc").
public class Question_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		String res = "";
		res += str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i - 1)) {
				res += str.charAt(i);
			}
		}
		System.out.println(res);

	}
}
