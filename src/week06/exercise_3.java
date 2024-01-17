package week06;

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scanN = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = scanN.nextInt();
        }
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
