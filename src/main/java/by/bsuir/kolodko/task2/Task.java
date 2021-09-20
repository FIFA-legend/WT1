package by.bsuir.kolodko.task2;

import java.util.Scanner;

public class Task {

    private static boolean isInShadedArea(double x, double y) {
        return (x >= -4 && x <= 4 && y >= 0 && y <= 5) ||
                (x >= -6 && x <= 6 && y >= -3 && y <= 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = scan.nextDouble();
        System.out.print("Input y: ");
        double y = scan.nextDouble();
        boolean result = isInShadedArea(x, y);
        System.out.println("Result: " + result);
    }

}
