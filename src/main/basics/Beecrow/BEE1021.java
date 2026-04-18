package basics.Beecrow;

import java.util.Scanner;

public class BEE1021 {

    public static int[] calculateNotesAndCoins(double value) {

        int[] quantities = new int[12];

        int amount = (int) Math.round(value * 100); // CORREÇÃO IMPORTANTE

        // NOTAS
        quantities[0] = amount / 10000;
        amount %= 10000;

        quantities[1] = amount / 5000;
        amount %= 5000;

        quantities[2] = amount / 2000;
        amount %= 2000;

        quantities[3] = amount / 1000;
        amount %= 1000;

        quantities[4] = amount / 500;
        amount %= 500;

        quantities[5] = amount / 200;
        amount %= 200;

        // MOEDAS
        quantities[6] = amount / 100;
        amount %= 100;

        quantities[7] = amount / 50;
        amount %= 50;

        quantities[8] = amount / 25;
        amount %= 25;

        quantities[9] = amount / 10;
        amount %= 10;

        quantities[10] = amount / 5;
        amount %= 5;

        quantities[11] = amount;

        return quantities;
    }

    public static String formatResult(int[] q) {
        return "NOTAS:\n"
            + q[0] + " nota(s) de R$ 100.00\n"
            + q[1] + " nota(s) de R$ 50.00\n"
            + q[2] + " nota(s) de R$ 20.00\n"
            + q[3] + " nota(s) de R$ 10.00\n"
            + q[4] + " nota(s) de R$ 5.00\n"
            + q[5] + " nota(s) de R$ 2.00\n"
            + "MOEDAS:\n"
            + q[6] + " moeda(s) de R$ 1.00\n"
            + q[7] + " moeda(s) de R$ 0.50\n"
            + q[8] + " moeda(s) de R$ 0.25\n"
            + q[9] + " moeda(s) de R$ 0.10\n"
            + q[10] + " moeda(s) de R$ 0.05\n"
            + q[11] + " moeda(s) de R$ 0.01\n";
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double value = keyboard.nextDouble(); // CORREÇÃO

        int[] quantities = calculateNotesAndCoins(value);

        System.out.print(formatResult(quantities));

        keyboard.close();
    }
}
