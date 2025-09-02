package Assignment_4;

import java.util.Scanner;

//10. Remove a Specific Character from a String
//Problem:
//Write a Java program to remove all occurrences of a specific character from a string.
//Example Input:
//String: "Hello World"
//Character to Remove: 'l'
//
//Expected Output:
//Modified String: "Heo Word"
public class Question_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String res = "";
		for(char c : str1.toCharArray()) {
			if(c!=str2.charAt(0)) {
				res+=c;
			}
		}
		System.out.print(res);
	}
}
