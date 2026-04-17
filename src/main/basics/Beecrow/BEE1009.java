package basics.Beecrow;

import java.util.Scanner;

public class BEE1009 {

  public static double calculateTotal(double salary, double bonus) {
    return salary + (bonus * 0.15);
  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    @SuppressWarnings("unused")
    String nome = teclado.nextLine(); // intentionally ignored
    double salario = teclado.nextDouble();
    double bonus = teclado.nextDouble();

    double total = calculateTotal(salario, bonus);

    System.out.printf("TOTAL = R$ %.2f\n", total);

    teclado.close();
  }
}
