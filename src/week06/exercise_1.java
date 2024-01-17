package week06;

import java.util.Random;
import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        double n = Math.random();
        n *= 100;
        n = (int)n;
        System.out.println(n);
        int guesses = 1;
        System.out.println("Guess a number!");
        Scanner scanN = new Scanner(System.in);
        int guess = scanN.nextInt();
        while (!(guess == n)) {
            System.out.println("Try again!");
            guess = scanN.nextInt();
            guesses++;
        }
        System.out.println("You guessed the number in " + guesses + " tries!");
    }
}
