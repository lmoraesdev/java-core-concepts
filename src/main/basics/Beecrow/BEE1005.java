package basics.Beecrow;

import java.util.Scanner;

public class BEE1005 {
  public static double Media(double a, double b){
    return ( a * 3.5  +  b * 7.5 ) / 11;
  }

  public static void main(String[] args ){
    Scanner teclado = new Scanner(System.in);

    double A = teclado.nextDouble();
    double B = teclado.nextDouble();

    double media = Media(A, B);

    System.out.printf("MEDIA = %.5f\n", media);

    teclado.close();
  }


}
