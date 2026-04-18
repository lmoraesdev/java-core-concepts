package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BEE1007Test {

  @Test
  void shouldCalculateDifferenceCorrectly() {
    int result = BEE1007.diferenca(5, 6, 7, 8);

    assertEquals(-26, result);
  }

  @Test
  void shouldReturnZeroWhenProductsAreEqual() {
    int result = BEE1007.diferenca(2, 3, 1, 6);

    assertEquals(0, result);
  }

  @Test
  void shouldHandleNegativeResult() {
    int result = BEE1007.diferenca(1, 1, 10, 10);

    assertEquals(-99, result);
  }

  @Test
  void shouldHandlePositiveResult() {
    int result = BEE1007.diferenca(10, 10, 1, 1);

    assertEquals(99, result);
  }
}
