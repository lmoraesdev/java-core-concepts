package basics.Beecrow.Sequencial;

import java.util.Scanner;

public class BEE1020 {

    public static int[] yearsMonthDay(int totalDays) {

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        return new int[]{ years, months, days };
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int inputDays = keyboard.nextInt();

        int[] result = yearsMonthDay(inputDays);

        System.out.println(result[0] + " ano(s)");
        System.out.println(result[1] + " mes(es)");
        System.out.println(result[2] + " dia(s)");

        keyboard.close();
    }
}
