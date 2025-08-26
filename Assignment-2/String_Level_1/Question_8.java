package Bridgelabz_Training.Assignment-2. String_Level_1;

import java.util.Scanner;

public class Question_8 {
	public static void generateException(String[] names) {

		System.out.println("Accessing element: " + names[5]);

	}

	public static void handleException(String[] names) {

		try {
			System.out.println("Accessing element: " + names[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Caught RuntimeException: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of names: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] names = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
			names[i] = sc.nextLine();
		}
		try {
			generateException(names);
		} catch (Exception e) {
			System.out.println("Exception occurred in generateException(): " + e);
		}
		handleException(names);
	}
}
