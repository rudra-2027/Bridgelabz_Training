package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Count the number of words in a string (use StringTokenizer)
public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int wordCount = 0;
		boolean inWord = false;
		for (char c : str.toCharArray()) {
			if (c != ' ' && !inWord) {
				wordCount++;
				inWord = true;
			} else if (c == ' ') {
				inWord = false;
			}
		}
		System.out.println("Number of words: " + wordCount);

	}

}
