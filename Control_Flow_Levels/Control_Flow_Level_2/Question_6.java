package Control_Flow_Level_2;

import java.util.Scanner;

//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
//Hint => 
//Take user input for the age and height of the 3 friends and store it in a variable
//Find the smallest of the 3 ages to find the youngest friend and display it
//Find the largest of the 3 heights to find the tallest friend and display it

public class Question_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.println("Enter height of Amar: ");
        double heightAmar = sc.nextDouble();

        System.out.println("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter height of Akbar: ");
        double heightAkbar = sc.nextDouble();

        System.out.println("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter height of Anthony: ");
        double heightAnthony = sc.nextDouble();

        
        String youngest = "";
        if(ageAmar <= ageAkbar && ageAmar <= ageAnthony){
            youngest = "Amar";
        } else if(ageAkbar <= ageAmar && ageAkbar <= ageAnthony){
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

      
        String tallest = "";
        if(heightAmar >= heightAkbar && heightAmar >= heightAnthony){
            tallest = "Amar";
        } else if(heightAkbar >= heightAmar && heightAkbar >= heightAnthony){
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

       
        System.out.println("Youngest is: " + youngest);
        System.out.println("Tallest is: " + tallest);
	}
}
