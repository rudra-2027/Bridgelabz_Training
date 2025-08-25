package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Reverse each word in a sentence (e.g., "Hello World" → "olleH dlroW").
public class Queston_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != ' ') {
                word = c + word;
            } else {
                result += word + " ";
                word = "";
            }
        }

        result += word;

        System.out.println("Reversed words: " + result);
    }
}
