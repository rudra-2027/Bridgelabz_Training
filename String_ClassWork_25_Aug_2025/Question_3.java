package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

//Count the number of vowels in a string.
public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int vow = 0;
		for (char c : str.toCharArray()) {
			if (check(c)) {
				vow++;
			}
		}
		System.out.println(vow);
	}

	public static boolean check(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}

}
