package week17;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetOps {
    public static TreeSet<Integer> generateSet() {
        TreeSet <Integer> values = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            values.add((int)(Math.random() * 100) + 1);
        }
        return values;
    }

    public static TreeSet <Integer> addElements(TreeSet <Integer> values, int... numbers) {
        for (int x : numbers) {
            values.add(x);
        }
        return values;
    }

    public static Integer[] convertToArray(TreeSet <Integer> values) {
        return values.toArray(new Integer[0]);
    }

    public static void manipulateData(Integer[] arrs) {
        int sum = 0;
        int max = -1;
        int min = Integer.MAX_VALUE;
        double average;
        for (int x : arrs) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            sum += x;
        }
        average = (double) sum / arrs.length;
        System.out.println(min + " " + max + " " + average + " " + sum);
    }

    public static void main(String[] args) {
        TreeSet <Integer> values = generateSet();
        System.out.println(values);
        addElements(values, 10, 100, 100, 100);
        addElements(values, 50, 100);
        addElements(values, 1);
        System.out.println(values);
        System.out.println(Arrays.toString(convertToArray(values)));
        manipulateData(convertToArray(values));
    }
}
