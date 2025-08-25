package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

//Check if two strings are equal (case-sensitive and case-insensitive).
public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if (s1.equals(s2)) {
			System.out.println("Are Equal");
		} else {
			System.out.println("Are UnEqual");
		}
	}
}
