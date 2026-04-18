package basics.Beecrow;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1021Test {

    @Test
    void shouldCalculateNotesAndCoinsForExampleValue() {
        int[] result = BEE1021.calculateNotesAndCoins(576.73);

        assertArrayEquals(new int[] { 5, 1, 1, 0, 1, 0, 1, 1, 0, 2, 0, 3 }, result);
    }

    @Test
    void shouldCalculateOnlyCoins() {
        int[] result = BEE1021.calculateNotesAndCoins(0.99);

        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 0, 4 }, result);
    }

    @Test
    void shouldCalculateExactOneHundred() {
        int[] result = BEE1021.calculateNotesAndCoins(100.00);

        assertArrayEquals(new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, result);
    }

    @Test
    void shouldCalculateZeroValue() {
        int[] result = BEE1021.calculateNotesAndCoins(0.00);

        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, result);
    }

    @Test
    void shouldCalculateSmallDecimalValue() {
        int[] result = BEE1021.calculateNotesAndCoins(0.04);

        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4 }, result);
    }

    @Test
    void shouldFormatResultCorrectly() {
        int[] quantities = { 5, 1, 1, 0, 1, 0, 1, 1, 0, 2, 0, 3 };

        String result = BEE1021.formatResult(quantities);

        String expected =
            "NOTAS:\n"
                + "5 nota(s) de R$ 100.00\n"
                + "1 nota(s) de R$ 50.00\n"
                + "1 nota(s) de R$ 20.00\n"
                + "0 nota(s) de R$ 10.00\n"
                + "1 nota(s) de R$ 5.00\n"
                + "0 nota(s) de R$ 2.00\n"
                + "MOEDAS:\n"
                + "1 moeda(s) de R$ 1.00\n"
                + "1 moeda(s) de R$ 0.50\n"
                + "0 moeda(s) de R$ 0.25\n"
                + "2 moeda(s) de R$ 0.10\n"
                + "0 moeda(s) de R$ 0.05\n"
                + "3 moeda(s) de R$ 0.01\n";

        assertEquals(expected, result);
    }

    @Test
    void shouldHandleFloatingPointPrecision() {
        int[] result = BEE1021.calculateNotesAndCoins(0.30);

        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, result);
    }
}
