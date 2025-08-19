package basicQuestion3F;

import java.util.Scanner;

public class convertKmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double Miles = km * 0.621371;
        System.out.println(Miles);
    }
}
