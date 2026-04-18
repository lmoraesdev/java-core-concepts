package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BEE1005Test {

  @Test
  void shouldCalculateWeightedAverageCorrectly() {
    double result = BEE1005.Media(5.0, 7.1);

    assertEquals(6.43182, result, 0.00001);
  }

  @Test
  void shouldReturnZeroWhenBothGradesAreZero() {
    double result = BEE1005.Media(0.0, 0.0);

    assertEquals(0.0, result, 0.00001);
  }

  @Test
  void shouldReturnTenWhenBothGradesAreTen() {
    double result = BEE1005.Media(10.0, 10.0);

    assertEquals(10.0, result, 0.00001);
  }

  @Test
  void shouldCalculateCorrectlyWhenGradesAreDifferent() {
    double result = BEE1005.Media(10.0, 5.0);

    assertEquals(6.59091, result, 0.00001);
  }
}
