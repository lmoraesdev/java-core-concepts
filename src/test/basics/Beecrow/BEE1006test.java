package basics.Beecrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BEE1006Test {

  @Test
  void shouldCalculateWeightedAverageCorrectly() {
    double result = BEE1006.Media(5.0, 6.0, 7.0);

    assertEquals(6.3, result, 0.0001);
  }

  @Test
  void shouldReturnZeroWhenAllGradesAreZero() {
    double result = BEE1006.Media(0.0, 0.0, 0.0);

    assertEquals(0.0, result, 0.0001);
  }

  @Test
  void shouldReturnTenWhenAllGradesAreTen() {
    double result = BEE1006.Media(10.0, 10.0, 10.0);

    assertEquals(10.0, result, 0.0001);
  }

  @Test
  void shouldHandleDifferentWeightsCorrectly() {
    double result = BEE1006.Media(10.0, 0.0, 0.0);

    assertEquals(2.0, result, 0.0001);
  }
}
