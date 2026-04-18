package basics.Beecrow.Sequencial;

import java.util.Scanner;

public class BEE1014 {
  public static double calculatorConsumption( int km, double l){
    return km / l;
  }

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    int A = keyboard.nextInt();
    double B = keyboard.nextDouble();
    double consumption = calculatorConsumption(A, B);

    System.out.printf("%.3f km/l\n", consumption);
    keyboard.close();
  }
}
