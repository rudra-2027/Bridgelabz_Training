package Control_Flow_Level_3;

import java.util.Scanner;

//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
//
//Hint => 
//Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks

public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Physics Marks ");
		int s1 = sc.nextInt();
		System.out.println("Enter The Chemistry Marks ");
		int s2 = sc.nextInt();
		System.out.println("Enter The Maths Marks ");
		int s3 = sc.nextInt();
		int avg = (s1+s2+s3)/3;
		if(avg>=80) {
			System.out.println("A");
		}else if(avg>=70) {
			System.out.println("B");
		}else if(avg>=60) {
			System.out.println("C");
		}else if(avg>=50) {
			System.out.println("D");
		}else if(avg>=40) {
			System.out.println("E");
		}else {
			System.out.println("R");
		}
	}

}
