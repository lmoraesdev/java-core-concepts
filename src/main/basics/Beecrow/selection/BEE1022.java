package basics.Beecrow.selection;

import java.util.Scanner;

public class BEE1022 {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    int A, B, C, D;

    A = keyboard.nextInt();
    B = keyboard.nextInt();
    C = keyboard.nextInt();
    D = keyboard.nextInt();

    if( (B > C) && (D > A) && ( C + D > A +B) && (C > 0) && ( A %2 == 0)){
      System.out.println("Valores aceitos");
    } else {
      System.out.println("Valores nao aceitos");
    }

    keyboard.close();
  }
}
