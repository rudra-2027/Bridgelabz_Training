package Bridgelabz_Training.Assignment-2. String_Level_1;

import java.util.Scanner;

public class Question_6 {
	public static void generateException(String str) {
		String result = str.substring(5, 2);
		System.out.println("Substring: " + result);

	}

	public static void handleException(String str) {

		try {
			String result = str.substring(5, 2);
			System.out.println("Substring: " + result);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught IllegalArgumentException: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Caught RuntimeException: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		try {
			generateException(str);
		} catch (Exception e) {
			System.out.println("Exception occurred in generateException(): " + e);
		}

		handleException(str);
	}
}
