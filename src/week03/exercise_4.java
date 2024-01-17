package week03;

import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        String name = scanN.nextLine();
        String firstNL = name.substring(0,1);
        String secondNL = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2);
        String lastNL = name.substring(name.lastIndexOf(" ") + 1, name.lastIndexOf(" ") + 2);
        System.out.println(firstNL.toUpperCase().concat(name.substring(1, name.indexOf(" ") + 1).concat(secondNL.toUpperCase().concat(name.substring(name.indexOf(" ") + 2, name.lastIndexOf(" ") + 1))).concat(lastNL.toUpperCase().concat(name.substring(name.lastIndexOf(" ") + 2)))));
    }
}
