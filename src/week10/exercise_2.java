package week10;

import java.util.Objects;
import java.util.Scanner;

//test values: 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in), scanP = new Scanner(System.in);
        double[] prices = new double[16];
        boolean[][] seats = new boolean[31][16];
        int  sold = 0;
        double revenue = 0;
        int nInputs;
        int k, l = 0;
        Boolean[] changes = new Boolean[31];
        for (int i = 1; i < 31; i++) {
            changes[i] = false;
        }

        System.out.println("Enter seat pricing: ");
        for (int i = 0; i < 15; i++) {
            prices[i] = scanN.nextDouble();
        }

        while (true) {
            for (int i = 1; i <= 30; i++) {
                for (int j = 1; j <= 15; j++) {
                    if (seats[i][j]) {
                        System.out.print('*');
                    } else {
                        System.out.print('#');
                    }
                }
                if (changes[i]) {
                    System.out.print(" <--- new change");
                }
                System.out.println();
            }

            for (int i = 1; i < 31; i++) {
                changes[i] = false;
            }

            String n;
            n = scanP.nextLine();
            String[] inputs = n.split(" ");

            nInputs = inputs.length;

            for (int i = 0; i < nInputs; i++) {
                try {
                    k = Integer.parseInt(inputs[i]);
                    if (++i < nInputs) {
                        l = Integer.parseInt(inputs[i]);
                    }
                    if (k > 30 || l > 15 || k < 1 || l < 1) {
                        System.out.println("The numbers that were given seem to be incorrect...");
                    } else if (seats[k][l]) {
                        System.out.println("Seat number " + l + " row " + k + " is already taken!");
                    } else {
                        seats[k][l] = true;
                        changes[k] = true;
                        revenue += prices[k];
                        sold++;
                    }
                } catch (NumberFormatException e) {
                    if (Objects.equals(inputs[i], "list")) {
                        System.out.println("Seats sold:  " + sold);
                        System.out.println("Vacant seats: " + (450 - sold));
                    } else if (Objects.equals(inputs[i], "exit")) {
                        System.out.print("Shutting down...");
                        System.exit(0);
                    } else if (Objects.equals(inputs[i], "revenue")) {
                        System.out.println("Total revenue: " + revenue);
                    }
                }
            }
        }
    }
}
