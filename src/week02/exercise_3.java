package week02;

public class exercise_3 {
    public static void main(String[] args) {
        double state_tax = 0.04;
        double country_tax = 0.02;
        int purchase = 52;
        System.out.println("Total price is $" + ((double)purchase + (double)purchase*state_tax + (double)purchase*country_tax));
    }
}
