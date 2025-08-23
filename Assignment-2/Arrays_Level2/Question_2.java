package Bridgelabz_Training.Assignment-2. Arrays_Level2;

import java.util.Scanner;

public class Question_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] names = { "Amar", "Akbar", "Anthony" };

    int[] ages = new int[3];
    double[] heights = new double[3];

    for (int i = 0; i < 3; i++) {
      System.out.println("Enter details for " + names[i]);
      System.out.print("Age: ");
      ages[i] = sc.nextInt();
      System.out.print("Height (in cm): ");
      heights[i] = sc.nextDouble();
    }
    int minAgeIdx = 0;
    for (int i = 1; i < 3; i++) {
      if (ages[i] < ages[minAgeIdx]) {
        minAgeIdx = i;
      }
    }

    int maxHeightIdx = 0;
    for (int i = 1; i < 3; i++) {
      if (heights[i] > heights[maxHeightIdx]) {
        maxHeightIdx = i;
      }
    }
    System.out.println("Youngest Friend: " + names[minAgeIdx] + " (Age: " + ages[minAgeIdx] + ")");
    System.out.println("Tallest Friend: " + names[maxHeightIdx] + " (Height: " + heights[maxHeightIdx] + " cm)");

  }
}
