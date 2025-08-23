package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.Scanner;

//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 1
public class Question_1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n;
		while (i != 10) {
			System.out.print("Enter the age of Student " + (i + 1) + " ");
			n = sc.nextInt();

			arr[i++] = n;

		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 18) {
				System.out.println("The Student " + (j + 1) + " With Age " + arr[j] + " can vote");
			} else {
				System.out.println("The Student " + (j + 1) + " With Age " + arr[j] + " can not vote");
			}
		}

	}
}
