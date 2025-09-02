package Assignment_4;

import java.util.Scanner;

//Write a Java program that accepts two strings from the user and checks if the two
//strings are anagrams of each other (i.e., whether they contain the same characters in any
//order).
public class Question_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] freq = new int[256];
       
        for (char c : str1.toCharArray()) {
            freq[c]++;
        }

     
        for (char c : str2.toCharArray()) {
            freq[c]--;
        }

      
        boolean isAnagram = true;
        for (int count : freq) {
            if (count != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
	}
}
