package Bridgelabz_Training.Assignment-2. String_Level_1;

import java.util.Scanner;

public class Question_7 {
	public static void generateException(String str) {
		int n = Integer.parseInt(str);
		System.out.println("Converted Number: " + n);

	}

	public static void handleException(String str) {

		try {
			int number = Integer.parseInt(str);
			System.out.println("Converted Number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Caught NumberFormatException: " + e.getMessage());
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
