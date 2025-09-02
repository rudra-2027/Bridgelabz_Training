package Assignment_4;

import java.util.Scanner;

//Palindrome String Check
//Problem:
//Write a Java program to check if a given string is a palindrome (a string that reads the
//same forward and backward).//
public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean check = checkPalindrome(str);
		if(check) {
			System.out.print("Given String "+str +" Is A Palindromic String");
		}
		else {
			System.out.print("Given String "+str +" Is Not A Palindromic String");
		}
	}
	public static boolean checkPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}

