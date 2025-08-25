package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Convert a string to uppercase without using toUpperCase() (ASCII based)
public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String res = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c >= 'a' && c <= 'z') {
				res += (char) (c + 32);
			} else {
				res += c;
			}
		}
		System.out.println(res);
	}

}
