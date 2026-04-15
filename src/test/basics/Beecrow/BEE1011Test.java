package basics.Beecrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BEE1011Test {

  @Test
  void shouldCalculateVolumeCorrectly() {
    double result = BEE1011.calculateSphereVolume(3);

    assertEquals(113.097, result, 0.001);
  }

  @Test
  void shouldCalculateAnotherExample() {
    double result = BEE1011.calculateSphereVolume(15);

    assertEquals(14137.155, result, 0.001);
  }
}
