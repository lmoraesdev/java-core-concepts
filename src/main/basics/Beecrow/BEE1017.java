package basics.Beecrow;

import java.util.Scanner;

public class BEE1017 {

    private static final double KM_PER_LITER = 12.0;

    public static double calculateFuel(int hours, int averageSpeed) {
        double distance = hours * averageSpeed;
        return distance / KM_PER_LITER;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int hours = keyboard.nextInt();
        int averageSpeed = keyboard.nextInt();

        double fuelNeeded = calculateFuel(hours, averageSpeed);

        System.out.printf("%.3f\n", fuelNeeded);

        keyboard.close();
    }
}
