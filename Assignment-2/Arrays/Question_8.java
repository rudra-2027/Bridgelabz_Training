package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.Scanner;

public class Question_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int maxFactor = 10;
    int[] factors = new int[maxFactor];
    int index = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {

        if (index == maxFactor) {

          maxFactor = maxFactor * 2;
          int[] temp = new int[maxFactor];
          for (int j = 0; j < index; j++) {
            temp[j] = factors[j];
          }
          factors = temp;
        }
        factors[index] = i;
        index++;
      }
    }

    System.out.println("Factors of " + number + " are:");
    for (int i = 0; i < index; i++) {
      System.out.print(factors[i] + " ");
    }
  }

}
