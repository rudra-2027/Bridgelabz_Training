package Bridgelabz_Training.Assignment-2. Arrays_Level2;

import java.util.Scanner;

public class Question_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] marks = new int[n][3];
    double[] percentage = new double[n];
    String[] grade = new String[n];
    for (int i = 0; i < n; i++) {
      System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");

      for (int j = 0; j < 3; j++) {
        String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
        int mark;
        do {
          System.out.print(subject + ": ");
          mark = sc.nextInt();
          if (mark < 0) {
            System.out.println("Marks cannot be negative! Enter again.");
          }
        } while (mark < 0);

        marks[i][j] = mark;
      }
      int total = marks[i][0] + marks[i][1] + marks[i][2];
      percentage[i] = total / 3.0;
      if (percentage[i] >= 80) {
        grade[i] = "A";
      } else if (percentage[i] >= 70) {
        grade[i] = "B";
      } else if (percentage[i] >= 60) {
        grade[i] = "C";
      } else if (percentage[i] >= 50) {
        grade[i] = "D";
      } else if (percentage[i] >= 40) {
        grade[i] = "E";
      } else {
        grade[i] = "R";
      }
    }
    for (int i = 0; i < n; i++) {
      String remark = "";
      switch (grade[i]) {
        case "A":
          remark = "Above standards";
          break;
        case "B":
          remark = "At standards";
          break;
        case "C":
          remark = "Below, approaching";
          break;
        case "D":
          remark = "Well below";
          break;
        case "E":
          remark = "Too below";
          break;
        case "R":
          remark = "Remedial";
          break;
      }

      System.out.println(
          marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percentage[i] + " " + grade[i] + " " + remark);
    }
  }
}
