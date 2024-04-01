package week14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class testingStuff {
    public static void main(String[] args) {
        Scanner scanP = new Scanner(System.in);

        char[] input = new char[100];
        input = scanP.nextLine().toCharArray();
        for (int i = 0; i < input.length; i++) {
            System.out.print((int) (input[i]) + " ");
        }
    }
}
