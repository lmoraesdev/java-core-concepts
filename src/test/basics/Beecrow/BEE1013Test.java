package basics.Beecrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1013Test {

    @Test
    void shouldReturnBiggerValueWhenFirstIsGreater() {
        int result = BEE1013.calculateBigger(20, 10);

        assertEquals(20, result);
    }

    @Test
    void shouldReturnBiggerValueWhenSecondIsGreater() {
        int result = BEE1013.calculateBigger(10, 20);

        assertEquals(20, result);
    }

    @Test
    void shouldReturnSameValueWhenBothAreEqual() {
        int result = BEE1013.calculateBigger(15, 15);

        assertEquals(15, result);
    }

    @Test
    void shouldReturnBiggestValueAmongThreeNumbers() {
        int result = BEE1013.calculateBiggestOfThree(7, 14, 106);

        assertEquals(106, result);
    }

    @Test
    void shouldReturnBiggestValueWhenFirstIsLargest() {
        int result = BEE1013.calculateBiggestOfThree(217, 14, 6);

        assertEquals(217, result);
    }

    @Test
    void shouldReturnBiggestValueWithNegativeNumbers() {
        int result = BEE1013.calculateBiggestOfThree(-10, -3, -20);

        assertEquals(-3, result);
    }

    @Test
    void shouldReturnSameValueWhenAllNumbersAreEqual() {
        int result = BEE1013.calculateBiggestOfThree(8, 8, 8);

        assertEquals(8, result);
    }
}
