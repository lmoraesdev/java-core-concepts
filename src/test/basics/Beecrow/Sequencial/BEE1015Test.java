package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1015Test {

    @Test
    void shouldCalculateDistanceExample() {
        double result = BEE1015.CalculateDistance(1.0, 7.0, 5.0, 9.0);

        assertEquals(4.4721, result, 0.0001);
    }

    @Test
    void shouldCalculateSamePoint() {
        double result = BEE1015.CalculateDistance(2.0, 3.0, 2.0, 3.0);

        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void shouldCalculateHorizontalDistance() {
        double result = BEE1015.CalculateDistance(0.0, 0.0, 5.0, 0.0);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void shouldCalculateVerticalDistance() {
        double result = BEE1015.CalculateDistance(0.0, 0.0, 0.0, 7.0);

        assertEquals(7.0, result, 0.0001);
    }

    @Test
    void shouldCalculateWithNegativeCoordinates() {
        double result = BEE1015.CalculateDistance(-2.0, -3.0, 2.0, 1.0);

        assertEquals(5.6568, result, 0.0001);
    }

    @Test
    void shouldCalculateDiagonalDistance() {
        double result = BEE1015.CalculateDistance(0.0, 0.0, 3.0, 4.0);

        assertEquals(5.0, result, 0.0001);
    }
}
