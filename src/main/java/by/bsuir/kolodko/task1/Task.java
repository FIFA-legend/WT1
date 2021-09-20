package by.bsuir.kolodko.task1;

import java.util.Scanner;

public class Task {

    private static double calculateFraction(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double innerFraction = (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2));
        double denominator = 2 + Math.abs(x - innerFraction);
        return numerator / denominator + x;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = scan.nextDouble();
        System.out.print("Input y: ");
        double y = scan.nextDouble();
        double result = calculateFraction(x, y);
        System.out.println("Result: " + result);
    }

}
