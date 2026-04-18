package basics.Beecrow.Sequencial;

import java.util.Scanner;

public class BEE1007 {

  public static int diferenca(int A, int B, int C, int D) {
    return (A * B - C * D);
  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int A = teclado.nextInt();
    int B = teclado.nextInt();
    int C = teclado.nextInt();
    int D = teclado.nextInt();

    int diferenca = diferenca(A, B, C, D);

    System.out.println("DIFERENCA = " + diferenca);

    teclado.close();
  }
}
