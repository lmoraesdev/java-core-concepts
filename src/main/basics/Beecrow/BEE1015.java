package basics.Beecrow;

import java.util.Scanner;

public class BEE1015 {
  public static double CalculateDistance(double x1, double y1, double x2, double y2){
    double distance1 = x2 - x1;
    double distance2 = y2 - y1;

    return  Math.sqrt((distance1 * distance1) + (distance2 *distance2));
  }

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    double x1 = keyboard.nextDouble();
    double y1 = keyboard.nextDouble();
    double x2 = keyboard.nextDouble();
    double y2 = keyboard.nextDouble();

    double value;

    value = CalculateDistance(x1, y1, x2, y2);

    System.out.printf("%.4f\n", value);

    keyboard.close();
  }
}
