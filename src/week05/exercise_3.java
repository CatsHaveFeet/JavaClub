package week05;

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        System.out.println("What is the first number?");
        int a = scanN.nextInt();
        System.out.println("What is the second number?");
        int b = scanN.nextInt();
        System.out.println("What is the third number?");
        int c = scanN.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(c);
            } else {
                System.out.println(a);
            }
        } else {
            if (a > b) {
                System.out.println(b);
            }
            else {
                System.out.println(a);
            }
        }
    }
}
