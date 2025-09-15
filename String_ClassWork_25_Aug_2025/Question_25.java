package Bridgelabz_Training.String_ClassWork_25_Aug_2025;

// Find all permutations of a string.
import java.util.Scanner;

public class Question_25 {
    public static void rec(char[] str, int l, int r) {
        if (l == r) {

            for (int i = 0; i <= r; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
        } else {
            for (int i = l; i <= r; i++) {

                swap(str, l, i);

                rec(str, l + 1, r);

                swap(str, l, i);
            }
        }

    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] arr = input.toCharArray();
        int n = arr.length;

        System.out.println("All permutations of the string are:");
        rec(arr, 0, n - 1);
    }
}
