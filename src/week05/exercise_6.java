package week05;

import java.util.Scanner;
import java.util.Vector;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        Vector <Integer> v = new Vector<Integer>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter revenue for store nr." + (i + 1));
            v.add(scanN.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            int x = v.get(i);
            while (x >= 100) {
                System.out.print('*');
                x -= 100;
            }
            System.out.println();
        }
    }
}
