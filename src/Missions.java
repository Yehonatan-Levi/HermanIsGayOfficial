import java.util.Scanner;

public class Missions {
    public static Scanner scanner = new Scanner(System.in);

    public static void infinitePrintMax(int... numbers) {
        System.out.println(Util.max(numbers));
    }

    public static void printAverage(double number1, double number2, double number3) {
        System.out.println(Util.average(number1, number2, number3));
    }

    public static void printIsBothEven(double number1, double number2) {
        if (Util.isEven(number1) && Util.isEven(number2)) {
            System.out.println("Both numbers are even");
        } else {
            System.out.println("Womp Womp not both of the numbers are even");
        }
    }

    public static void isBiggerThenAverage(double number1, double number2) {
        if (Util.average(number1, number2) > number1) {
            System.out.println("No way!!! the average is bigger then Herman's bana-sorry i meant the first number");
        } else {
            System.out.println("The average is smaller then the second number");
        }
    }

    public static void maxBankHandle() {
        String message = "Enter the amount of money the bank has:";
        int bank1 = Util.inputInt(message);
        int bank2 = Util.inputInt(message);
        int bank3 = Util.inputInt(message);
        infinitePrintMax(bank1, bank2, bank3);
    }

    public static void printIsEvenLength(int number) {
        System.out.print(Util.isEven(Util.getNumberLength(number)) ? "the length of the number " + number + " is even\n" : "");
    }

    public static void printMin(int... numbers) {
        System.out.println(Util.min(numbers));
    }

    public static void exHandleNumbers() {
        String message = "Enter a number:";
        int number1 = Util.inputInt(message);
        int number2 = Util.inputInt(message);
        int number3 = Util.inputInt(message);

        printIsEvenLength(number1);
        printIsEvenLength(number2);
        printIsEvenLength(number3);

        infinitePrintMax(Util.getNumberLength(number1), Util.getNumberLength(number2), Util.getNumberLength(number3));
        printMin(Util.getNumberLength(number1), Util.getNumberLength(number2), Util.getNumberLength(number3));
    }

    public static void printMaxNumber() {
        String message = "Enter a number:";
        int number1 = Util.inputInt(message);
        int number2 = Util.inputInt(message);
        int number3 = Util.inputInt(message);
        int number4 = Util.inputInt(message);
        int number5 = Util.inputInt(message);

        infinitePrintMax(number1, number2, number3, number4, number5);
    }

    public static void printYetter() {
        String message = "Enter a side of a right angle triangle:";
        double side1 = Util.inputDouble(message);
        double side2 = Util.inputDouble(message);
        System.out.print("The third side is:" + Util.distance(side1, side2));
    }

    public static int infiniteMaxNumber() {
        String message = "Enter a number:";
        int number = Util.inputInt(message);
        int max = Integer.MIN_VALUE;

        while (number != 0) {
            max = Math.max(max, number);
            number = Util.inputInt(message);
        }

        return max;
    }

    public static void infinitePrintMaxNumber() {
        System.out.println(infiniteMaxNumber());
    }
}
