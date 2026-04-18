package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1017Test {

    @Test
    void shouldCalculateFuel() {
        double result = BEE1017.calculateFuel(10, 85);

        assertEquals(70.833, result, 0.001);
    }

    @Test
    void shouldCalculateFuelZero() {
        double result = BEE1017.calculateFuel(0, 0);

        assertEquals(0.0, result);
    }

    @Test
    void shouldCalculateFuelTwoHours() {
        double result = BEE1017.calculateFuel(2, 92);

        assertEquals(15.333, result, 0.001);
    }

    @Test
    void shouldCalculateFuelForAnotherExampleFromStatement() {
        double result = BEE1017.calculateFuel(22, 67);

        assertEquals(122.833, result, 0.001);
    }

    @Test
    void shouldReturnZeroWhenHoursIsZero() {
        double result = BEE1017.calculateFuel(0, 85);

        assertEquals(0.0, result);
    }

    @Test
    void shouldReturnZeroWhenSpeedIsZero() {
        double result = BEE1017.calculateFuel(10, 0);

        assertEquals(0.0, result);
    }

    @Test
    void shouldCalculateFuelForOneHourAtTwelveKmPerHour() {
        double result = BEE1017.calculateFuel(1, 12);

        assertEquals(1.0, result);
    }

    @Test
    void shouldCalculateFuelForLargeValues() {
        double result = BEE1017.calculateFuel(100, 120);

        assertEquals(1000.0, result);
    }
}
