package basics.Beecrow;

public class BEE1004 {

  public static int calculateProduct( int a, int b){
    return a * b;
  }

  public static void main(String args[]){
    java.util.Scanner teclado = new java.util.Scanner(System.in);

    int a = teclado.nextInt();
    int b = teclado.nextInt();

    int prod = calculateProduct(a, b);

    System.out.println("PROD = "+ prod);

    teclado.close();
  }
}
