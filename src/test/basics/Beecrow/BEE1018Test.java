package basics.Beecrow;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1018Test {

    @Test
    void shouldCalculateNotesFor576() {
        int[] result = BEE1018.calculateNotes(576);

        assertArrayEquals(new int[]{5, 1, 1, 0, 1, 0, 1}, result);
    }

    @Test
    void shouldCalculateNotesFor11257() {
        int[] result = BEE1018.calculateNotes(11257);

        assertArrayEquals(new int[]{112, 1, 0, 0, 1, 1, 0}, result);
    }

    @Test
    void shouldCalculateNotesFor503() {
        int[] result = BEE1018.calculateNotes(503);

        assertArrayEquals(new int[]{5, 0, 0, 0, 0, 1, 1}, result);
    }

    @Test
    void shouldReturnAllZerosForZeroInput() {
        int[] result = BEE1018.calculateNotes(0);

        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0}, result);
    }

    @Test
    void shouldFormatResultCorrectly() {
        int amount = 576;
        int[] notes = {5, 1, 1, 0, 1, 0, 1};

        String expected =
                "576\n" +
                "5 nota(s) de R$ 100,00\n" +
                "1 nota(s) de R$ 50,00\n" +
                "1 nota(s) de R$ 20,00\n" +
                "0 nota(s) de R$ 10,00\n" +
                "1 nota(s) de R$ 5,00\n" +
                "0 nota(s) de R$ 2,00\n" +
                "1 nota(s) de R$ 1,00";

        String result = BEE1018.formatResult(amount, notes);

        assertEquals(expected, result);
    }
}
