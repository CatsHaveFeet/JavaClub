package week05;

import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        System.out.println("What number do you want to divide?");
        int n = scanN.nextInt();
        System.out.println("What number do you want to divide " + n + " by?");
        int d = scanN.nextInt();
        System.out.println("Remainder is " + n % d);
    }
}
