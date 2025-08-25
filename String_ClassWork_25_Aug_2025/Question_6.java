package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

//Find the first non-repeating character in a string.
public class Question_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] freq = new int[256];
		for (char c : str.toCharArray()) {
			freq[c]++;
		}
		for (char c : str.toCharArray()) {
			if (freq[c] == 1) {
				System.out.println(c);
				break;
			}
		}
	}

}
