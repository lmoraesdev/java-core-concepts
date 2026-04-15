package basics.Beecrow;

import java.util.Scanner;

public class BEE1008 {
  public static double calcularSalario(int horas, double valorPorHora) {
    return horas * valorPorHora;
  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int numero = teclado.nextInt();
    int horas = teclado.nextInt();
    double valorPorHora = teclado.nextDouble();

    double salario = calcularSalario(horas, valorPorHora);

    System.out.println("NUMBER = " + numero);
    System.out.printf("SALARY = U$ %.2f\n", salario);

    teclado.close();
  }
}
