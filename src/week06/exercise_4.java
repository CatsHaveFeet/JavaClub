package week06;

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[] sum = {0, 0, 0, 0};
        int sumT;
        boolean ok = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanN.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            sumT = 0;
            for (int j = 0; j < 3; j++) {
                sumT += a[i][j];
                sum[j] += a[i][j];
            }
            if (sum[3] == 0) {
                sum[3] = sumT;
            }else {
                if (sumT != sum[3]) {
                    ok = false;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (sum[i] != sum[3]) {
                ok = false;
            }
        }
        if (ok) {
            System.out.println("yuh uh");
        }else {
            System.out.println("nuh uh");
        }
    }
}
