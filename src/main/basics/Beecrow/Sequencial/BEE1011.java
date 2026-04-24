package basics.Beecrow.Sequencial;

import java.util.Scanner;

public class BEE1011 {
  public static double calculateSphereVolume(double radius) {
    return (4.0 / 3.0) * 3.14159 * (radius * radius * radius);
  }

  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

    double R = teclado.nextDouble();

    double volume = calculateSphereVolume(R);

    System.out.printf("VOLUME = %.3f\n", volume);

    teclado.close();
  }
}
