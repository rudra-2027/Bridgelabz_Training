package Bridgelabz_Training.String_ClassWork_25_Aug_2025;
//Implement your own split() method (without using built-in split() or StringTokenizer).

import java.util.Scanner;

public class Question_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		String[] words = mySplit(str);
		System.out.println("Words:");
		for (String w : words) {
			System.out.println(w);
		}

	}

	public static String[] mySplit(String str) {
		int cnt = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				cnt++;
			}
		}
		String[] result = new String[cnt];
		String temp = "";
		int idx = 0;
		for (char c : str.toCharArray()) {
			if (c != ' ') {
				temp += c;

			} else {
				result[idx++] = temp;
				temp = "";
			}
		}
		result[idx] = temp;
		return result;
	}
}
