package week05;

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        System.out.println("Enter a number...");
        int n = scanN.nextInt();
        while (n < 0) {
            System.out.println("Value has to be negative!");
            n = scanN.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
