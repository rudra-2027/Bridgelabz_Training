package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Implement your own replace() function.
public class Question_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        System.out.print("Enter replace Value From: ");
        String start = sc.nextLine();
        System.out.print("Enter replace Value end: ");
        String end = sc.nextLine();

        String rec = replace(str, start, end);
        System.out.println(rec);
    }

    public static String replace(String str, String start, String end) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            boolean match = true;
            for (int j = 0; j < start.length(); j++) {
                if (i + j >= str.length() || str.charAt(i + j) != start.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                result += end;
                i += start.length();
            } else {
                result += str.charAt(i);
                i++;
            }
        }
        return result;

    }

}
