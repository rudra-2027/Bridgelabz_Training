package Bridgelabz_Training.Assignment-2. Arrays_Level2;

import java.util.Scanner;

public class Question_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] weight = new double[n];
    double[] height = new double[n];
    double[] BMI = new double[n];
    String[] status = new String[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Enter details for Person " + (i + 1));
      System.out.print("Weight (kg): ");
      weight[i] = sc.nextDouble();
      System.out.print("Height (m): ");
      height[i] = sc.nextDouble();
    }
    for (int i = 0; i < n; i++) {
      BMI[i] = weight[i] / (height[i] * height[i]);

      if (BMI[i] <= 18.4) {
        status[i] = "Underweight";
      } else if (BMI[i] <= 24.9) {
        status[i] = "Normal";
      } else if (BMI[i] <= 39.9) {
        status[i] = "Overweight";
      } else {
        status[i] = "Obese";
      }
    }
    System.out.println("\n--- BMI Report ---");
    for (int i = 0; i < n; i++) {
      System.out.println("Person " + (i + 1) + ": "
          + "Weight = " + weight[i] + " kg, "
          + "Height = " + height[i] + " m, "
          + "BMI = " + String.format("%.2f", BMI[i]) + ", "
          + "Status = " + status[i]);
    }

  }
}
