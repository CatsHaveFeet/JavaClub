package week02;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        Scanner scanP = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = scanP.nextLine();

        System.out.println("Where do you live ? ");
        String adress = scanP.nextLine();

        System.out.println("What is your phone #? ");
        int number = scanN.nextInt();

        System.out.println("What is your favorite #? ");
        byte fav_number = scanN.nextByte();
    }
}
