package basics.Beecrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1012Test {

    @Test
    void shouldCalculateTriangleAreaCorrectly() {
        double result = BEE1012.calculateTriangleArea(3.0, 5.2);

        assertEquals(7.800, result, 0.001);
    }

    @Test
    void shouldCalculateCircleAreaCorrectly() {
        double result = BEE1012.calculateCircleArea(5.2);

        assertEquals(84.949, result, 0.001);
    }

    @Test
    void shouldCalculateTrapeziumAreaCorrectly() {
        double result = BEE1012.calculateTrapeziumArea(3.0, 4.0, 5.2);

        assertEquals(18.200, result, 0.001);
    }

    @Test
    void shouldCalculateSquareAreaCorrectly() {
        double result = BEE1012.calculateSquareArea(4.0);

        assertEquals(16.000, result, 0.001);
    }

    @Test
    void shouldCalculateRectangleAreaCorrectly() {
        double result = BEE1012.calculateRectangleArea(3.0, 4.0);

        assertEquals(12.000, result, 0.001);
    }

    @Test
    void shouldCalculateAllAreasForAnotherExample() {
        assertEquals(96.520, BEE1012.calculateTriangleArea(12.7, 15.2), 0.001);
        assertEquals(725.833, BEE1012.calculateCircleArea(15.2), 0.001);
        assertEquals(175.560, BEE1012.calculateTrapeziumArea(12.7, 10.4, 15.2), 0.001);
        assertEquals(108.160, BEE1012.calculateSquareArea(10.4), 0.001);
        assertEquals(132.080, BEE1012.calculateRectangleArea(12.7, 10.4), 0.001);
    }
}
