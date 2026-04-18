package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1019Test{

    @Test
    void shouldConvertOnlySeconds() {
        String result = BEE1019.converter(59);
        assertEquals("0:0:59", result);
    }

    @Test
    void shouldConvertExactlyOneMinute() {
        String result = BEE1019.converter(60);
        assertEquals("0:1:0", result);
    }

    @Test
    void shouldConvertMinutesAndSeconds() {
        String result = BEE1019.converter(125);
        assertEquals("0:2:5", result);
    }

    @Test
    void shouldConvertExactlyOneHour() {
        String result = BEE1019.converter(3600);
        assertEquals("1:0:0", result);
    }

    @Test
    void shouldConvertFullTime() {
        String result = BEE1019.converter(3661);
        assertEquals("1:1:1", result);
    }

    @Test
    void shouldConvertZero() {
        String result = BEE1019.converter(0);
        assertEquals("0:0:0", result);
    }
}
