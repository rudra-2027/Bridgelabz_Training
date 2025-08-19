package basicQuestion3F;

import java.util.Scanner;

public class calculateSimpleProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int time = sc.nextInt();
        int SI = (P * R * time) / 100;
        System.out.println(SI);
    }
}
