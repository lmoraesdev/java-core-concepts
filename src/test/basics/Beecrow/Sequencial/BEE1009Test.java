package basics.Beecrow.Sequencial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1009Test {

  @Test
  void shouldCalculateTotalCorrectly() {
    double salary = 500.00;
    double bonus = 1230.30;

    double result = BEE1009.calculateTotal(salary, bonus);

    assertEquals(684.545, result, 0.001);
  }

  @Test
  void shouldReturnOnlySalaryWhenBonusIsZero() {
    double salary = 700.00;
    double bonus = 0.0;

    double result = BEE1009.calculateTotal(salary, bonus);

    assertEquals(700.00, result, 0.001);
  }

  @Test
  void shouldCalculateHighValues() {
    double salary = 1700.00;
    double bonus = 1230.50;

    double result = BEE1009.calculateTotal(salary, bonus);

    assertEquals(1884.575, result, 0.001);
  }
}
