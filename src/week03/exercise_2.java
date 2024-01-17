package week03;

public class exercise_2 {
    public static void main(String[] args) {
        String name = "bucharest";
        String firstLetter = name.substring(0,1);
        String remainingText = name.substring(1);
        System.out.println(firstLetter.toUpperCase().concat(remainingText));
    }
}
