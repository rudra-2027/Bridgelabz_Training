package Assignment_4;

import java.util.Scanner;

//Find the Most Frequent Character
//Problem:
//Write a Java program to find the most frequent character in a string.
//Example Input:
//String: "success"
//
//Expected Output:
//Most Frequent Character: 's'
public class Question_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] freq = new int[256];
		for(char ch : str.toCharArray()) {
			freq[ch]++;
		}
		int ans = 0;
        char freqChar = ' ';

        for (char ch : str.toCharArray()) {
            if (freq[ch] > ans) {
                ans = freq[ch];
                freqChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + freqChar + "'");
	}
}
