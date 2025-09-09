package Control_Flow_Level_3;

import java.util.Scanner;

//Create a program to find the BMI of a person
//Hint => 
//Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
//Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
//Use the table to determine the weight status of the person


public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100;

      
        double bmi = weight / (heightM * heightM);

     
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi <= 18.5) {
            System.out.println(" Underweight");
        } else if (bmi < 24.9) {
            System.out.println(" Normal weight");
        } else if (bmi < 39.9) {
            System.out.println(" Overweight");
        } else {
            System.out.println(" Obese");
        }
    }
}
