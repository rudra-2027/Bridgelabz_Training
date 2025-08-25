package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

//Find the ASCII value of each character in a string.
public class Question_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		String[][] arr = new String[str.length()][2];
		for (int i = 0; i < str.length(); i++) {
			arr[i][0] = String.valueOf(str.charAt(i));
			arr[i][1] = String.valueOf((int) (str.charAt(i)));

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("    " + arr[i][0] + "        " + arr[i][1]);
		}
	}
}
