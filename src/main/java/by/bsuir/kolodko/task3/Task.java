package by.bsuir.kolodko.task3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task {

    private static Map<Double, Double> countSegmentValues(double a, double b, double h) {
        Map<Double, Double> values = new TreeMap<>();
        int amount = (int) ((b - a) / h);
        for (int i = 0; i <= amount; i++) {
            double value = a + i * h;
            values.put(value, Math.tan(value));
        }
        return values;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = scan.nextDouble();
        System.out.print("Input b: ");
        double b = scan.nextDouble();
        System.out.print("Input h: ");
        double h = scan.nextDouble();
        for (Map.Entry<Double, Double> entry : countSegmentValues(a, b, h).entrySet()) {
            System.out.printf("%-5.2f|%-5.2f\n", entry.getKey(), entry.getValue());
        }
    }

}
