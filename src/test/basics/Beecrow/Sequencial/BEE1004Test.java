package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class BEE1004Test {

    @Test
    void shouldCalculateProductCorrectly() {
        int result = BEE1004.calculateProduct(3, 9);

        assertEquals(27, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int result = BEE1004.calculateProduct(-30, 10);

        assertEquals(-300, result);
    }

    @Test
    void shouldHandleZero() {
        int result = BEE1004.calculateProduct(0, 9);

        assertEquals(0, result);
    }
}
