package week04;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        int n = scanN.nextInt();
        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }
    }

}
