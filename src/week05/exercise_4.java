package week05;

import java.util.Scanner;
import java.util.Vector;

public class exercise_4 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        int i = 0;
        Vector<Integer> v = new Vector<Integer>(5);
        while (i < 5) {
            int x;
            System.out.println("Enter a number");
            v.add(x = scanN.nextInt());
            i++;
        }
        for (i = 0; i < 5; i++) {
            System.out.print(v.get(i) + " ");
        }
    }
}
