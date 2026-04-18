package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1010Test {

  @Test
  void shouldCalculateTotalCorrectly() {
    double result = BEE1010.calculateTotal(1, 5.30, 2, 5.10);

    assertEquals(15.50, result, 0.001);
  }

  @Test
  void shouldCalculateAnotherExample() {
    double result = BEE1010.calculateTotal(2, 15.30, 4, 5.20);

    assertEquals(51.40, result, 0.001);
  }
}
