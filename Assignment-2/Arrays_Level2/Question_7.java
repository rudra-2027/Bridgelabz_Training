package Bridgelabz_Training.Assignment-2. Arrays_Level2;

import java.util.Scanner;

public class Question_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    double[][] personData = new double[number][3];
    String[] weightStatus = new String[number];
    for (int i = 0; i < number; i++) {
      System.out.println("\nPerson " + (i + 1) + ":");
      double height;
      do {
        System.out.print("Enter height in meters (positive): ");
        height = sc.nextDouble();
      } while (height <= 0);
      double weight;
      do {
        System.out.print("Enter weight in kg (positive): ");
        weight = sc.nextDouble();
      } while (weight <= 0);
      double bmi = weight / (height * height);
      personData[i][0] = height;
      personData[i][1] = weight;
      personData[i][2] = bmi;
      if (bmi < 18.5) {
        weightStatus[i] = "Underweight";
      } else if (bmi < 24.9) {
        weightStatus[i] = "Normal weight";
      } else if (bmi < 29.9) {
        weightStatus[i] = "Overweight";
      } else {
        weightStatus[i] = "Obese";
      }

    }
    System.out.println("\n--- BMI Report ---");
    for (int i = 0; i < number; i++) {
      System.out.println("Person " + (i + 1) + ": " +
          "Weight = " + personData[i][0] + " kg, " +
          "Height = " + personData[i][1] + " m, " +
          "BMI = " + String.format("%.2f", personData[i][2]) + ", " +
          "Status = " + weightStatus[i]);
    }
  }
}
