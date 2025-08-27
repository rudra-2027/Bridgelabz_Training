package Assignment_3_Part2;

import java.util.Scanner;

//Palindrome Checker:
//○ Write a program that checks if a given string is a palindrome (a word, phrase, or
//sequence that reads the same backward as forward).
//○ Break the program into functions for input, checking the palindrome condition,
//and displaying the result.
public class Question_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean res = checkPalindrome(str);
		if(res) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
	}
	public static boolean checkPalindrome(String str) {
		str = str.replaceAll("\\s+","").toLowerCase();
		System.out.println(str);
		int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    
	}
	

}
