package week05;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        Scanner scanP = new Scanner(System.in);
        int speed = scanN.nextInt();
        if (speed >= 55 && speed <= 74) {
            System.out.println("You have to pay $100");
        } else if (speed >= 75 && speed <= 84) {
            System.out.println("You have to pay $150");
        } else if (speed >= 85 && speed <= 94) {
            System.out.println("You have to pay $320");
        } else if (speed >= 95) {
            System.out.println("Do you have your driver's licence on you?");
            String dl = scanP.nextLine();
            if (dl.equalsIgnoreCase("yes")) {
                System.out.println("You have to pay $500 and I have to suspend your licence");
            } else {
                System.out.println("You have to pay $500 plus an extra $150 for driving without a driver's licence");
            }
        } else {
            System.out.println("You are OK");
        }
    }
}
