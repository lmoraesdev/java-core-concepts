package basics;

import java.util.Scanner;

public class ifElse {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double n1, n2, me;
    System.out.println("Digite a N1:");
    n1 = keyboard.nextDouble();
    System.out.println("Digite a N2:");
    n2 = keyboard.nextDouble();

    me = (n1 + n2)/2;

    System.out.println("Sua Media vale"+ me);

    if( me >= 6.0){
      System.out.println("Parabens!! Aprovado!");
    } else {
      System.out.println("Puxa vida, nos vemos na proxima");
    }
    keyboard.close();
  }
}
