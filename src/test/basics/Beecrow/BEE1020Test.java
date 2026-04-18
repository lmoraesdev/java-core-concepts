package basics.Beecrow;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BEE1020Test {

    @Test
    void shouldConvertExample400() {
        int[] result = BEE1020.yearsMonthDay(400);

        assertArrayEquals(new int[]{1, 1, 5}, result);
    }

    @Test
    void shouldConvertExample800() {
        int[] result = BEE1020.yearsMonthDay(800);

        assertArrayEquals(new int[]{2, 2, 10}, result);
    }

    @Test
    void shouldConvertOnlyMonth() {
        int[] result = BEE1020.yearsMonthDay(30);

        assertArrayEquals(new int[]{0, 1, 0}, result);
    }

    @Test
    void shouldConvertOnlyYear() {
        int[] result = BEE1020.yearsMonthDay(365);

        assertArrayEquals(new int[]{1, 0, 0}, result);
    }

    @Test
    void shouldConvertZero() {
        int[] result = BEE1020.yearsMonthDay(0);

        assertArrayEquals(new int[]{0, 0, 0}, result);
    }

    @Test
    void shouldConvertOnlyDays() {
        int[] result = BEE1020.yearsMonthDay(29);

        assertArrayEquals(new int[]{0, 0, 29}, result);
    }

    @Test
    void shouldConvertExactYearAndMonth() {
        int[] result = BEE1020.yearsMonthDay(395);

        assertArrayEquals(new int[]{1, 1, 0}, result);
    }

    @Test
    void shouldConvertLargeValue() {
        int[] result = BEE1020.yearsMonthDay(10000);

        assertArrayEquals(new int[]{27, 4, 25}, result);
    }
}
