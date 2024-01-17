package week03;

public class exercise_3 {
    public static void main(String[] args) {
        String name = "andrei surubariu";
        System.out.println(name.substring(0,1).toUpperCase().concat(name.substring(1,7).concat(name.substring(7,8).toUpperCase().concat(name.substring(8)))));
    }
}
