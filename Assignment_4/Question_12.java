package Assignment_4;

import java.util.Scanner;

//12. Write a replace method in Java that replaces a given word with another word in a
//sentence:
public class Question_12 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the old word:");
		String word = sc.nextLine();

        System.out.println("Enter the new word:");
        String ans = sc.nextLine();

        String result = str.replaceAll("\\b" + word + "\\b", ans);

        System.out.println("Modified Sentence: " + result);
		
	}
}
