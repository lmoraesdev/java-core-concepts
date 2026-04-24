package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BEE1008Test {

  @Test
  void shouldCalculateSalaryCorrectly() {
    double result = BEE1008.calcularSalario(100, 5.50);

    assertEquals(550.00, result, 0.0001);
  }

  @Test
  void shouldReturnZeroWhenHoursAreZero() {
    double result = BEE1008.calcularSalario(0, 10.0);

    assertEquals(0.0, result, 0.0001);
  }

  @Test
  void shouldHandleDifferentValuesCorrectly() {
    double result = BEE1008.calcularSalario(200, 20.50);

    assertEquals(4100.00, result, 0.0001);
  }

  @Test
  void shouldHandleDecimalHourlyRate() {
    double result = BEE1008.calcularSalario(145, 15.55);

    assertEquals(2254.75, result, 0.0001);
  }
}
