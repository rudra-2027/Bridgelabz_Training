package Assignment_3_Part2;

import java.util.Scanner;

//Basic Calculator:
//○ Write a program that performs basic mathematical operations (addition,
//subtraction, multiplication, division) based on user input.
//○ Each operation should be performed in its own function, and the program should
//prompt the user to choose which operation to perform.
public class Question_9 {
	public static double add(double num1, double num2) {
		return num1+num2;
	}
	public static void subtract(double num1, double num2) {
		double result;
		if(num1>num2) {
			result = num1-num2;
			System.out.println("Subtraction of number "+num1+" - "+num2+" = "+result);
		}else {
			result = num1-num2;
			System.out.println("Subtraction of number "+num1+" - "+num2+" = "+result);
		}
		
		}
	public static double multiply(double num1, double num2) {
		return num1*num2;
	}
	public static double divide(double num1, double num2) {
		if(num2==0) {
			System.out.println("Number Cannot Divisble By 0");
			return Double.NaN;
		}
		return num1/num2;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Basic Calculator");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.print("Choose an operation (1-4): ");
	        int choice = sc.nextInt();

	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();

	        double result = 0;
	        switch (choice) {
	            case 1:
	                result = add(num1, num2);
	                System.out.println("Result: " + result);
	                break;
	            case 2:
	                subtract(num1, num2);
	                
	                break;
	            case 3:
	                result = multiply(num1, num2);
	                System.out.println("Result: " + result);
	                break;
	            case 4:
	                result = divide(num1, num2);
	                if (!Double.isNaN(result)) {
	                    System.out.println("Result: " + result);
	                }
	                break;
	            default:
	                System.out.println("Invalid choice! Please choose 1-4.");
	        }

	}
}
