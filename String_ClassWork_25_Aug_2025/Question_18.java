package Bridgelabz_Training.String_ClassWork_25_Aug_2025;
// Find the longest word in a sentence.

import java.util.Scanner;

public class Question_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		String cur = "";
		String longest = "";
		for (char c : str.toCharArray()) {
			if (c != ' ') {
				cur += c;
			} else {
				if (cur.length() > longest.length()) {
					longest = cur;
				}
				cur = "";
			}
		}
		if (cur.length() > longest.length()) {
			longest = cur;
		}
		System.out.println(longest);

	}
}
