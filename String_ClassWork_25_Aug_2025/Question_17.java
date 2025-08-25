package Bridgelabz_Training.String_ClassWork_25_Aug_2025;
// Toggle the case of each character in a string.

import java.util.Scanner;

public class Question_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		String res = "";
		for (char c : str.toCharArray()) {
			if (c >= 'A' && c <= 'Z') {
				res += (char) (c + 32);
			} else if (c >= 'a' || c <= 'Z') {
				res += (char) (c - 32);
			}
		}
		System.out.println(res);
	}
}
