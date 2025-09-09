package Control_Flow_Level_1;
//Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
//Hint => 
//Take the user input number and check whether it's a Natural number
//If it's a natural number Compute using formulae as well as compute using for loop
//Compare the two results and print the result

import java.util.Scanner;

public class Question_13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n>0) {
			int total = n*(n+1)/2;
			
			int sum = 0;
			for (int i = 1; i <= n; i++) {
                sum += i;
            }
			
			System.out.println("Sum using formula: " + total);
			System.out.println("Sum using while loop: " + sum);
			if(total == sum) {
				System.out.println("Both are equal ");
				
			}else {
				System.out.println("Both are unequal");
			}
		}
	}
		
}
