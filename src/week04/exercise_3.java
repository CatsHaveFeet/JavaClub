package week04;

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        String n = scanN.nextLine();
        while (!n.equalsIgnoreCase("green") && !n.equalsIgnoreCase("red")) {
            System.out.println("Input must be 'green' or 'red'!");
            n = scanN.nextLine();
        }
        if (n.equalsIgnoreCase("green")) {
            System.out.println("Continue");
        }
        else {
            System.out.println("Stop");
        }
    }
}
