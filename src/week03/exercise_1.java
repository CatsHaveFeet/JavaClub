package week03;

public class exercise_1 {
    public static void main(String[] args) {
        String city = "Bucharest";
        System.out.println("Name length: " + city.length());
        System.out.println("Name contains 'w': " + city.contains("w"));
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.equals("Bucuresti"));
    }
}
