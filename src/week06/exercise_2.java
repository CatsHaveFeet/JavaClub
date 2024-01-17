package week06;

public class exercise_2 {
    public static void main(String[] args) {
        int rand = (int)(Math.random() * 2) + 1;
        System.out.println(rand);
        if (rand == 1) {
            System.out.println("heads");
        } else {
            System.out.println("tails");
        }
    }
}
