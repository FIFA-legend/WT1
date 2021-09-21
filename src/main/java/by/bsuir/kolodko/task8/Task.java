package by.bsuir.kolodko.task8;

import java.util.LinkedList;
import java.util.List;

public class Task {

    private static List<Integer> indexes(int[] a, int[] b) {
        List<Integer> indexes = new LinkedList<>();
        int indexA = 0;
        int indexB = 0;
        while (indexA < a.length && indexB < b.length) {
            if (b[indexB] < a[indexA]) {
                indexes.add(indexA);
                indexB++;
            } else {
                indexA++;
            }
        }
        while (indexB < b.length) {
            indexes.add(a.length);
            indexB++;
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 1, 4, 6, 8, 10};
        int[] b1 = {0, 2, 3, 4, 5, 7, 10, 11, 12};
        System.out.println(indexes(a1, b1));

        int[] a2 = {1, 2, 3, 4, 5, 6};
        int[] b2 = {10, 11, 12, 13, 14, 15};
        System.out.println(indexes(a2, b2));

        int[] a3 = {6, 7, 8};
        int[] b3 = {1, 2, 3, 4, 4, 5, 5};
        System.out.println(indexes(a3, b3));

        int[] a4 = {1, 1, 3, 5, 7, 9};
        int[] b4 = {0, 2, 2, 4, 6, 6, 8, 10, 10};
        System.out.println(indexes(a4, b4));
    }

}
