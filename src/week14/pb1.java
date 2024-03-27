package week14;

import java.util.Arrays;
import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {

        Scanner scanP = new Scanner(System.in);
        String string = scanP.nextLine();
        String[] words = string.split(" ");
        //System.out.println(Arrays.toString(words));
        for (String x : words) {
            String firstLetter = x.substring(0,1);
            String remainingText = x.substring(1);
            System.out.print(firstLetter.toUpperCase().concat(remainingText) + ' ');
        }
    }
}
