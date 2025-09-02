package Assignment_4;

import java.util.Scanner;

//1. Count Vowels and Consonants
//Problem:
//Write a Java program to count the number of vowels and consonants in a given string.
public class Question_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int vow = 0;
	int cont = 0;
	
	for(char c : str.toCharArray()) {
		c = Character.toLowerCase(c);
		if(isVow(c)) {
			vow++;
		}else {
			cont++;
		}
		
	}
	System.out.println("Number Of Vowels in the "+str + " are "+ vow);
	System.out.println("Number Of Consonants in the "+str + " are "+ cont);

	
}
public static boolean isVow(char c) {
	return c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u';
}
}
