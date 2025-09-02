package Assignment_4;

import java.util.Scanner;

//5. Find the Longest Word in a Sentence
//Problem:
//Write a Java program that takes a sentence as input and returns the longest word in the
//sentence.
public class Question_5 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		String longest = "";
	
		for(String c : arr) {
			if(c.length()>longest.length()) {
				longest = c;
			}
		}
		System.out.print(longest);
				
	}
}
