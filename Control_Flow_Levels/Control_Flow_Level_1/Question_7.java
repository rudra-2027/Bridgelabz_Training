
package Control_Flow_Level_1;
import java.util.Scanner;

//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
//Hint => 
//Spring Season is from March 20 to June 20

public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.println("Enter the day (1-31): ");
        int day = sc.nextInt();
        boolean isSpring = (month ==3 && day>=20)||
        (month==4)||
        (month == 5) ||                
        (month == 6 && day <= 20);   
        if(isSpring) {
        	System.out.println("Its a spring Season");
        }else {
        	System.out.println("Not a Spring Season");
        }



	}

}
