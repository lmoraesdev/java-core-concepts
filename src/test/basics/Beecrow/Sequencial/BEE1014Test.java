package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1014Test {

    @Test
    void shouldCalculateConsumptionCorrectly() {
        double result = BEE1014.calculatorConsumption(500, 25.0);

        assertEquals(20.0, result);
    }

    @Test
    void shouldCalculateConsumptionWithDecimalResult() {
        double result = BEE1014.calculatorConsumption(350, 35.0);

        assertEquals(10.0, result);
    }

    @Test
    void shouldHandleNonIntegerConsumption() {
        double result = BEE1014.calculatorConsumption(100, 6.0);

        assertEquals(16.666666666666668, result);
    }

    @Test
    void shouldHandleZeroDistance() {
        double result = BEE1014.calculatorConsumption(0, 10.0);

        assertEquals(0.0, result);
    }

    @Test
    void shouldHandleLargeValues() {
        double result = BEE1014.calculatorConsumption(10000, 250.0);

        assertEquals(40.0, result);
    }
}
