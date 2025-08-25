package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Find the length of a string without using .length().
public class Question_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = 0;
		try {
			while (true) {
				str.charAt(len);
				len++;
			}
		} catch (Exception e) {
			System.out.println(len);
		}
	}
}
