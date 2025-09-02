package Assignment_4;

import java.util.Scanner;

//6. Find Substring Occurrences
//Problem:
//Write a Java program to count how many times a given substring occurs in a string.
public class Question_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int cnt = 0;
		int idx = 0;

        while ((idx = str1.indexOf(str2, idx)) != -1) {
            cnt++;
            idx = idx + str2.length(); 
        }

        System.out.println(cnt);
    }
	
}
