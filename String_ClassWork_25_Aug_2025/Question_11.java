package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

// Remove duplicate characters from a string.
import java.util.Scanner;

public class Question_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			boolean found = false;
			for (int j = 0; j < res.length(); j++) {
				if (res.charAt(j) == c) {
					found = true;
					break;
				}
			}
			if (!found) {
				res += c;
			}

		}
		System.out.println(res);
	}
}
