package Bridgelabz_Training.Assignment-2. Arrays_Level2;

import java.util.*;

public class Question_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int n = sc.nextInt();

    int[][] marks = new int[n][3];

    for (int i = 0; i < n; i++) {
      System.out.println("\nEnter marks for Student " + (i + 1) + ":");
      System.out.print("Physics: ");
      marks[i][0] = sc.nextInt();
      System.out.print("Chemistry: ");
      marks[i][1] = sc.nextInt();
      System.out.print("Maths: ");
      marks[i][2] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      int total = marks[i][0] + marks[i][1] + marks[i][2];
      double percentage = total / 3.0;

      char grade;
      if (percentage >= 90) {
        grade = 'A';
      } else if (percentage >= 75) {
        grade = 'B';
      } else if (percentage >= 50) {
        grade = 'C';
      } else {
        grade = 'D';
      }

      System.out.println("\nStudent " + (i + 1) + " Results:");
      System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]);
      System.out.println("Total: " + total);
      System.out.printf("Percentage: %.2f%%\n", percentage);
      System.out.println("Grade: " + grade);
    }

    sc.close();
  }
}
