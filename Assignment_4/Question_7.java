package Assignment_4;

import java.util.Scanner;

//7. Toggle Case of Characters
//Problem:
//Write a Java program to toggle the case of each character in a given string. Convert
//uppercase letters to lowercase and vice versa.
public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		for(char c : str.toCharArray()) {
			if(c>='a' && c<='z') {
				res+=(char)(c-32);
			}else if (c>='A' && c<='Z') {
				res+=(char)(c+32);
			}
		}
		System.out.print(res);
	}
}
