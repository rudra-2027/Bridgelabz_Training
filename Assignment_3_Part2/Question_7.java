package Assignment_3_Part2;

import java.util.Scanner;

//GCD and LCM Calculator:
//○ Create a program that calculates the Greatest Common Divisor (GCD) and Least
//Common Multiple (LCM) of two numbers using functions.
//○ Use separate functions for GCD and LCM calculations, showcasing how modular
//code works.
public class Question_7 {
    public static void main(String[] args) {
        int[] numbers = getInput();
        int a = numbers[0];
        int b = numbers[1];

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);

        displayResults(a, b, gcdValue, lcmValue);
    }

    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        return new int[] { a, b };
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }
}
