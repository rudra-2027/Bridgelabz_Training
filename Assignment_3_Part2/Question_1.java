package Assignment_3_Part2;

import java.util.Random;
import java.util.Scanner;

// 1. Number Guessing Game:
//○ Write a Java program where the user thinks of a number between 1 and 100, and
//the computer tries to guess the number by generating random guesses.
//○ The user provides feedback by indicating whether the guess is high, low, or
//correct. The program should be modular, with different functions for generating
//guesses, receiving user feedback, and determining the next guess.
public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int cnt = 0;
		int rnd  = random.nextInt(100);
		while(true) {
			System.out.println("Enter the value Btween 1 to 100: ");
			int n = sc.nextInt();
			if(n==rnd) {
				System.out.println("Hurry, You Guess the number! with in "+cnt+" rounds");
				break;
			}else if(n>rnd) {
				System.out.println("Opps! Guessed Number is greater number than the number ");
			}else if(n<rnd) {
				System.out.println("Opps! Guessed Number is smaller number than the number");
			}
			cnt++;
		}
		
	}

}
