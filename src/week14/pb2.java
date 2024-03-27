package week14;

import java.util.Scanner;

public class pb2 {
    public static String readLine() {
        Scanner scanP = new Scanner(System.in);
        return scanP.nextLine();
    }

    public static Integer [] readInts() {
        Scanner scanN = new Scanner(System.in);
        Integer [] ints = new Integer[500];
        String [] input = readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(input[i]));
        }
        return ints;
    }

    public static Integer populationOfCountries(String [] countryNames, Integer [] countryPopulations, String countryName) {
        int i = 0;
        for (String x : countryNames) {
            if (x.equalsIgnoreCase(countryName)) {
                return countryPopulations[i];
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String [] countryNames;
        countryNames = readLine().split(" ");
        Integer [] countryPopulations;
        countryPopulations = readInts();
        String countryName = readLine();
        System.out.println(populationOfCountries(countryNames,countryPopulations,countryName));
    }
}
