package week17;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetRandVal {
    public static HashSet <Integer> generateSet() {
        HashSet <Integer> values = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            values.add((int)(Math.random() * 100) + 1);
        }
        return values;
    }

    public static HashSet <Integer> addElements(HashSet <Integer> values, int... numbers) {
        for (int x : numbers) {
            values.add(x);
        }
        return values;
    }

    public static Integer[] convertToArray(HashSet <Integer> values) {
        return values.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        HashSet <Integer> values = generateSet();
        System.out.println(values);
        addElements(values, 10, 100, 100, 100);
        addElements(values, 50, 100);
        addElements(values, 1);
        System.out.println(values);
        System.out.println(Arrays.toString(convertToArray(values)));
    }
}