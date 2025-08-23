package Bridgelabz_Training.Assignment-2. Arrays_Level2;

import java.util.Scanner;

public class Question_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    long number = sc.nextLong();
    int[] frequency = new int[10];
    long temp = number;
    while (temp > 0) {
      int last = (int) (temp % 10);
      frequency[last]++;
      temp /= 10;
    }

    // Display frequencies
    System.out.println("\nFrequency of lasts in " + number + ":");
    for (int i = 0; i < 10; i++) {
      if (frequency[i] > 0) {
        System.out.println("last " + i + " => " + frequency[i] + " times");
      }
    }

  }
}
