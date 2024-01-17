package week10;

import java.util.Scanner;

public class exercise_1 {
    private static int getTotal (int[][] a) {
        int sum = 0;
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }
    private static double getAverage (double n) {
        return n / 9;
    }
    private static int getRowTotal (int[][] a, int n) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[n][i];
        }
        return sum;
    }
    private static int getColumnTotal (int[][] a, int n) {
        int sum = 0;
        for (int[] ints : a) {
            sum += ints[n];
        }
        return sum;
    }
    private static int getHighestInRow (int[][] a, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[n][i]);
        }
        return max;
    }
    private static int getLowestInRow (int[][] a, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[n][i]);
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int r, c, b, d;
        Scanner scanN = new Scanner(System.in);


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {     //reading array values
                a[i][j] = scanN.nextInt();
            }
        }


        r = scanN.nextInt();
        c = scanN.nextInt();      //reading the extra integer values
        b = scanN.nextInt();
        d = scanN.nextInt();


        System.out.println(getTotal(a));
        System.out.println(getAverage(getTotal(a)));
        System.out.println(getRowTotal(a, r));          //calling functions
        System.out.println(getColumnTotal(a, c));
        System.out.println(getHighestInRow(a, b));
        System.out.println(getLowestInRow(a, d));
    }
}
//1 2 3 4 5 6 7 8 9  test values