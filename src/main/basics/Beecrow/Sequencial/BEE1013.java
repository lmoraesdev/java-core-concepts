package basics.Beecrow.Sequencial;

import java.util.Scanner;

public class BEE1013 {

    public static int calculateBigger(int firstValue, int secondValue) {
        return (firstValue + secondValue + Math.abs(firstValue - secondValue)) / 2;
    }

    public static int calculateBiggestOfThree(int firstValue, int secondValue, int thirdValue) {
        int biggerBetweenFirstAndSecond = calculateBigger(firstValue, secondValue);
        return calculateBigger(biggerBetweenFirstAndSecond, thirdValue);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int firstValue = keyboard.nextInt();
        int secondValue = keyboard.nextInt();
        int thirdValue = keyboard.nextInt();

        int biggestValue = calculateBiggestOfThree(firstValue, secondValue, thirdValue);

        System.out.println(biggestValue + " eh o maior");

        keyboard.close();
    }
}
