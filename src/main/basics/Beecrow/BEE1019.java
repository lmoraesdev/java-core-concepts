package basics.Beecrow;

import java.util.Scanner;

public class BEE1019 {
      public static String converter(int totalSegundos) {
        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        return horas + ":" + minutos + ":" + segundos;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int segundos = teclado.nextInt();

        System.out.println(converter(segundos));

        teclado.close();
    }

}
