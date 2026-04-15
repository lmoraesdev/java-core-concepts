package basics.Beecrow;

import java.util.Locale;
import java.util.Scanner;

public class BEE1010 {
  public static double calculateTotal(int quantity1, double price1, int quantity2, double price2) {
    double totalItem1 = quantity1 * price1;
    double totalItem2 = quantity2 * price2;

    return totalItem1 + totalItem2;
  }

    public static void main(String[] args) {
    Locale.setDefault(Locale.US); // garante ponto ao invés de vírgula

    Scanner scanner = new Scanner(System.in);

    int code1 = scanner.nextInt();
    int quantity1 = scanner.nextInt();
    double price1 = scanner.nextDouble();

    int code2 = scanner.nextInt();
    int quantity2 = scanner.nextInt();
    double price2 = scanner.nextDouble();

    double total = calculateTotal(quantity1, price1, quantity2, price2);

    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    scanner.close();
  }
}
