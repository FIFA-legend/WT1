package by.bsuir.kolodko.task4;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Task {

    private static List<Integer> primeElementIndexes(int[] array) {
        List<Integer> indexes = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && BigInteger.valueOf(array[i]).isProbablePrime(3)) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] example1 = {1, 2, 3, 5, 10, 11, 100, 101};
        System.out.println(primeElementIndexes(example1));
        int[] example2 = {-1, 0, -5, -7, 13, 14};
        System.out.println(primeElementIndexes(example2));
        int[] example3 = {17, 19, 23, 29, 31, 37, 41};
        System.out.println(primeElementIndexes(example3));
        int[] example4 = {10, 20, 30, 40, 50};
        System.out.println(primeElementIndexes(example4));
    }

}
