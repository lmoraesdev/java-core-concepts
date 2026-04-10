package basics.Beecrow;

import java.util.Scanner;

public class BEE1002 {
  public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    // entrada
    double raio, area, n;
    n = 3.14159;
    raio = teclado.nextDouble();

    // processamento
    area = n * (raio * raio);

    // saida
    System.out.printf("A=%.4f\n", area);

    teclado.close();
  }
}
