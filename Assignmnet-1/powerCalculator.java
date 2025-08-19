package basicQuestion3F;

import java.util.Scanner;

public class powerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int p = sc.nextInt();
        double cal = Math.pow(b,p);
        System.out.println(cal);
    }
}
