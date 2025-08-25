package Bridgelabz_Training.String_ClassWork_25_Aug_2025;
//Count frequency of each character in a string.

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        String res = "";
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
        }
        System.out.println("Character frequencies:");
        for (char c : str.toCharArray()) {
            if (freq[c] > 0) {
                System.out.println(c + " -> " + freq[c]);
                freq[c] = 0;
            }
        }
    }
}
