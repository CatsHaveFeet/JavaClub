package week04;

import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scanP = new Scanner(System.in);
        int y = scanP.nextInt();
        System.out.println((2023 - y) * 365 + (2023 - y) / 4);
    }
}
