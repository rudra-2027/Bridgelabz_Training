package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

// Compress a string like "aaabbcc" → "a3b2c2" using StringBuilder.
import java.util.Scanner;

public class Question_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		int[] freq = new int[256];
		for (char c : str.toCharArray()) {
			freq[c]++;
		}
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (freq[c] != 0) {
				sb.append(c);
				sb.append(freq[c]);
				freq[c] = 0;
			}
		}
		System.out.println(sb.toString());

	}
}
