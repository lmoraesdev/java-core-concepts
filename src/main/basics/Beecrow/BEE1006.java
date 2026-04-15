package basics.Beecrow;

import java.util.Scanner;

public class BEE1006 {
    public static double Media(double A, double B, double C){
    return (A * 2 + B * 3 + C * 5) / 10.0;
  }
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

    double A, B, C, media;

    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();

    media = Media(A, B, C);

    System.out.printf("MEDIA = %.1f\n", media) ;

    teclado.close();
  }
}
