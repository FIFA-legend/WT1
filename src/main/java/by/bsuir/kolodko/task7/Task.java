package by.bsuir.kolodko.task7;

import java.util.Arrays;

public class Task {

    private static double[] sort(double[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                double tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i != 0) i--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array1 = {9, 5, 9, 8, 3, 2, 8, 5, 6};
        System.out.println(Arrays.toString(sort(array1)));

        double[] array2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(array2)));

        double[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sort(array3)));
    }

}
