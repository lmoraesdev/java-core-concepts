package basics.Beecrow;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BEE1012 {
  private static final double PI = 3.14159;

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2.0;
    }

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double calculateTrapeziumArea(double baseA, double baseB, double height) {
        return ((baseA + baseB) * height) / 2.0;
    }

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static void printArea(String label, double value) {
        System.out.printf("%s: %.3f%n", label, value);
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double valueA = scanner.nextDouble();
        double valueB = scanner.nextDouble();
        double valueC = scanner.nextDouble();

        double triangleArea = calculateTriangleArea(valueA, valueC);
        double circleArea = calculateCircleArea(valueC);
        double trapeziumArea = calculateTrapeziumArea(valueA, valueB, valueC);
        double squareArea = calculateSquareArea(valueB);
        double rectangleArea = calculateRectangleArea(valueA, valueB);

        printArea("TRIANGULO", triangleArea);
        printArea("CIRCULO", circleArea);
        printArea("TRAPEZIO", trapeziumArea);
        printArea("QUADRADO", squareArea);
        printArea("RETANGULO", rectangleArea);

        scanner.close();
    }
}
