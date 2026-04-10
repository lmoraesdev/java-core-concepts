package basics.Beecrow;

import java.util.Scanner;

public class BEE1001 {
  public static void main( String args[]){
    Scanner teclado = new Scanner(System.in);
    int A, B, X;
    // entrada
     A = teclado.nextInt();
     B = teclado.nextInt();

    // processamento
    X = A + B;

    // saida
    System.out.print("X = " + X);

    teclado.close();
  }
}
