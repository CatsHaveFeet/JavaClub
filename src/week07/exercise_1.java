package week07;

import java.util.Arrays;
import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        int cntr = 0;
        int[] lottery = new int[5], user = new int[5];
        for (int i = 0; i < 5; i++) {
            lottery[i] = (int)(Math.random() * 9);
        }
        System.out.println("Write your 5 numbers!");
        for (int i = 0; i < 5; i++) {
            user[i] = scanN.nextByte();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (lottery[i] == user[j]) {
                    cntr++;
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(lottery));
        System.out.println(cntr);
        if (cntr == 5) {
            System.out.println("You are big boss");
        }
    }
}
