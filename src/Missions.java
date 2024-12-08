import java.util.*;

public class Missions {
    public static Scanner input = new Scanner(System.in);

    public static double distance(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static int max(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        return max;
    }

    public static void printMax(int... numbers) {
        System.out.println(max(numbers));
    }

    public static int min(int... numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int inputInt(String request) {
        System.out.println(request);
        return input.nextInt();
    }

    public static double inputDouble(String request) {
        System.out.println(request);
        return input.nextDouble();
    }

    public static double average(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void printAverage(double number1, double number2, double number3) {
        System.out.println(average(number1, number2, number3));
    }

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }

    public static void printIsBothEven(double number1, double number2) {
        if (isEven(number1) && isEven(number2)) {
            System.out.println("Both numbers are even");
        } else {
            System.out.println("Womp Womp not both of the numbers are even");
        }
    }

    public static void isBiggerThenAverage(double number1, double number2) {
        if (average(number1, number2) > number1) {
            System.out.println("No way!!! the average is bigger then Herman's bana-sorry i meant the first number");
        } else {
            System.out.println("The average is smaller then the second number");
        }
    }

    public static void maxBankHandle() {
        String message = "Enter the amount of money the bank has:";
        int bank1 = inputInt(message);
        int bank2 = inputInt(message);
        int bank3 = inputInt(message);
        printMax(bank1, bank2, bank3);
    }


    public static int getNumberLength(int number) {
        int counter = 1;
        while (number > 10) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static void printIsEven(int number) {
        System.out.print(isEven(getNumberLength(number)) ? "the length of the number " + number + " is even\n" : "");
    }

    public static void printMin(int... numbers) {
        System.out.println(min(numbers));
    }

    public static void exHandleNumbers() {
        String message = "Enter a number:";
        int number1 = inputInt(message);
        int number2 = inputInt(message);
        int number3 = inputInt(message);

        printIsEven(number1);
        printIsEven(number2);
        printIsEven(number3);

        printMax(getNumberLength(number1), getNumberLength(number2), getNumberLength(number3));
        printMin(getNumberLength(number1), getNumberLength(number2), getNumberLength(number3));
    }

    public static void printMaxNumber() {
        String message = "Enter a number:";
        int number1 = inputInt(message);
        int number2 = inputInt(message);
        int number3 = inputInt(message);
        int number4 = inputInt(message);
        int number5 = inputInt(message);

        printMax(number1, number2, number3, number4, number5);
    }

    public static void printYetter() {
        String message = "Enter a side of a right angle triangle:";
        double side1 = inputDouble(message);
        double side2 = inputDouble(message);
        System.out.print("The third side is:" + distance(side1, side2));
    }
}
