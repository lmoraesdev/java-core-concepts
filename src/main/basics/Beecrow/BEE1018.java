package basics.Beecrow;

import java.util.Scanner;

public class BEE1018 {

    public static int[] calculateNotes(int amount) {
        int[] quantities = new int[7];

        quantities[0] = amount / 100;
        amount %= 100;

        quantities[1] = amount / 50;
        amount %= 50;

        quantities[2] = amount / 20;
        amount %= 20;

        quantities[3] = amount / 10;
        amount %= 10;

        quantities[4] = amount / 5;
        amount %= 5;

        quantities[5] = amount / 2;
        amount %= 2;

        quantities[6] = amount;

        return quantities;
    }

    public static String formatResult(int originalAmount, int[] quantities) {
        return originalAmount + "\n"
            + quantities[0] + " nota(s) de R$ 100,00\n"
            + quantities[1] + " nota(s) de R$ 50,00\n"
            + quantities[2] + " nota(s) de R$ 20,00\n"
            + quantities[3] + " nota(s) de R$ 10,00\n"
            + quantities[4] + " nota(s) de R$ 5,00\n"
            + quantities[5] + " nota(s) de R$ 2,00\n"
            + quantities[6] + " nota(s) de R$ 1,00";
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int amount = keyboard.nextInt();
        int[] quantities = calculateNotes(amount);

        System.out.println(formatResult(amount, quantities));

        keyboard.close();
    }
}
