package by.bsuir.kolodko.task5;

public class Task {

    private static int minElementsToRemove(int[] array) {
        int size = array.length;
        int[] lengths = new int[size];
        for (int i = 0; i < size; i++) {
            lengths[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && lengths[j] + 1 > lengths[i]) {
                    lengths[i] = lengths[j] + 1;
                }
            }
        }
        int maxLength = findMaxLength(lengths);
        return size - maxLength;
    }

    private static int findMaxLength(int[] lengths) {
        int maxLength = lengths[0];
        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] > maxLength) {
                maxLength = lengths[i];
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 0, 5, 6, 7, 8, 0, 9, 10};
        System.out.println(minElementsToRemove(array1));
        int[] array2 = {10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6};
        System.out.println(minElementsToRemove(array2));
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(minElementsToRemove(array3));
        int[] array4 = {1, 2, 0, 3, 4, 0, 5, 6, 0, 1, 7, 8, 0, 9, 10};
        System.out.println(minElementsToRemove(array4));
    }

}
