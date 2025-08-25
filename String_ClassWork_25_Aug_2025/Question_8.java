package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

import java.util.Scanner;

// Replace all spaces with hyphens in a string.
public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String res = "";
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                res += '-';

            } else {
                res += c;
            }
        }
        while (res.endsWith("-")) {
            res = res.substring(0, res.length() - 1);
        }
        System.out.println(res);

    }
}
