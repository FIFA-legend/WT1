package by.bsuir.kolodko.task6;

public class Task {

    private static double[][] matrix(double[] array) {
        int n = array.length;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            double[] line = new double[n];
            System.arraycopy(array, i, line, 0, n - i);
            System.arraycopy(array, 0, line, n - i, i);
            matrix[i] = line;
        }
        return matrix;
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] doubles : matrix) {
            for (double d : doubles) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printMatrix(matrix(array1));
        System.out.println();

        double[] array2 = {};
        printMatrix(matrix(array2));
        System.out.println();

        double[] array3 = {3.14, 2.15, 7.80};
        printMatrix(matrix(array3));
    }

}
