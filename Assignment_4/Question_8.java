package Assignment_4;

import java.util.Scanner;

//8. Compare Two Strings
//
//Problem:
//Write a Java program to compare two strings lexicographically (dictionary order) without
//using built-in compare methods.
//Example Input:
//String 1: "apple"
//String 2: "banana"
public class Question_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        int result = 0;

        
        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

       
        if (result == 0 && len1 != len2) {
            result = len1 - len2;
        }
        if(result == 0) {
        	System.out.println("Both are eqaul");
        }else if(result<0) {
        	System.out.println(str1+" come before "+str2 +" in lexicographically");
        }else if(result>0) {
        	System.out.println(str2+" come before "+str1 +" in lexicographically");
        }

	}

}
