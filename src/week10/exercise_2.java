package week10;

import java.util.Objects;
import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scanN = new Scanner(System.in);
        double[] prices = new double[15];
        boolean[][] seats = new boolean[30][15];
        int sold = 0;

        System.out.println("Enter seat pricing: ");
        for (int i = 0; i < 15; i++) {
            prices[i] = scanN.nextDouble();
        }

        while (true) {
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 15; j++) {
                    if (seats[i][j]) {
                        System.out.print('*');
                    }
                    else {
                        System.out.print('#');
                    }
                }
                System.out.println();
            }

            int k = -1, l = -1;
            while (scanN.hasNext()) {
                var n = scanN.next();
                try {
                    if (k == -1) {
                        k = Integer.parseInt(n);
                    } else if (l == -1) {
                        l = Integer.parseInt(n);
                        seats[k][l] = true;
                        k = -1;
                        l = -1;
                        sold++;
                    }

                } catch (NumberFormatException e) {
                    if (Objects.equals(n, "list")) {
                        System.out.println("Seats sold:  " + sold);
                        System.out.println("Total seats: 450");
                    } else if (Objects.equals(n, "exit")) {
                        System.exit(0);
                    } else if (Objects.equals(n, "revenue")) {
                        System.out.println("Total revenue: " + sold);
                    }
                }
            }
        }
    }
}
