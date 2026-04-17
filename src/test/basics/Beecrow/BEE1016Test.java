package basics.Beecrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1016Test {

    @Test
    void shouldReturnDoubleDistanceForBasicCase() {
        int result = BEE1016.calculateTime(30);

        assertEquals(60, result);
    }

    @Test
    void shouldReturnDoubleDistanceForAnotherCase() {
        int result = BEE1016.calculateTime(110);

        assertEquals(220, result);
    }

    @Test
    void shouldHandleSmallValue() {
        int result = BEE1016.calculateTime(7);

        assertEquals(14, result);
    }

    @Test
    void shouldReturnZeroWhenDistanceIsZero() {
        int result = BEE1016.calculateTime(0);

        assertEquals(0, result);
    }

    @Test
    void shouldHandleLargeValues() {
        int result = BEE1016.calculateTime(1000);

        assertEquals(2000, result);
    }
}
