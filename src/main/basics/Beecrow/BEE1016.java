package basics.Beecrow;

import java.util.Scanner;

public class BEE1016 {
  public static int calculateTime(int distance) {
    return distance * 2;
}
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    int distance = keyboard.nextInt();

    int time = calculateTime(distance);

    System.out.println(time + " minutos");

    keyboard.close();
  }
}
