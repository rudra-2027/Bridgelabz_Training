package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

// Capitalize the first letter of each word in a sentence
import java.util.Scanner;

public class Question_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		String res = "";
		boolean flag = true;
		for (char c : str.toCharArray()) {
			if (c == ' ') {
				res += c;
				flag = true;
			} else {
				if (flag) {
					if (c >= 'a' && c <= 'z') {
						c = (char) (c - 32);
					}
					flag = false;

				}
				res += c;
			}
		}
		System.out.println(res);

	}
}
