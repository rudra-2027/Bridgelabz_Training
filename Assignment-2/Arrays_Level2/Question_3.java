package Bridgelabz_Training.Assignment-2. Arrays_Level2;

import java.util.Scanner;

public class Question_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int maxDigit = 10;
    int[] digit = new int[maxDigit];
    int idx = 0;
    while (n != 0) {
      int last = n % 10;
      digit[idx++] = last;
      n /= 10;

      if (idx == maxDigit) {
        break;
      }
    }
    int largest = -1;
    int secondLargest = -1;
    for (int i = 0; i < idx; i++) {
      int d = digit[i];
      if (d > largest) {
        secondLargest = largest;
        largest = d;

      } else if (d > secondLargest && d != largest) {
        secondLargest = d;
      }
    }
    System.out.println("Digits stored in array:");
    for (int i = idx - 1; i >= 0; i--) {
      System.out.print(digit[i] + " ");
    }
    System.out.println();

    System.out.println("Largest digit: " + largest);
    if (secondLargest != -1) {
      System.out.println("Second Largest digit: " + secondLargest);
    } else {
      System.out.println("Second Largest digit: Not available");
    }
  }
}
