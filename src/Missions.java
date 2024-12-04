import java.util.*;

public class Missions {
    public static Scanner input = new Scanner(System.in);

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

    public static void exA2IsBiggerThenAverage(double number1, double number2) {
        if (average(number1, number2) > number1) {
            System.out.println("No way!!! the average is bigger then Herman's bana-sorry i meant the first number");
        } else {
            System.out.println("The average is smaller then the second number");
        }
    }

    public static int max(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        return max;
    }

    public static int min(int... numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static void printMax(int number1, int number2, int number3) {
        System.out.println(max(number1, number2, number3));
    }

    public static int bankMoneyAmount() {
        System.out.println("Enter the amount of money the bank has:");
        return input.nextInt();
    }

    public static void maxBankHandle() {
        int bank1 = bankMoneyAmount();
        int bank2 = bankMoneyAmount();
        int bank3 = bankMoneyAmount();
        printMax(bank1, bank2, bank3);
    }

    public static int inputInt(String request) {
        System.out.println(request);
        return input.nextInt();
    }

    public static int numberLength(int number) {
        int counter = 1;
        while (number > 10){
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static void printIfEven(int number) {
        System.out.print(isEven(numberLength()) ? "the length of the number " + number + " is even\n" : "");
    }


    public static void printMaxLength(int... numbers) {
        System.out.println("the number with the most amount of digits is: \n" + max(numbers));
    }

    public static void printMinLength(int... numbers) {
        System.out.println("the number with the least amount of digits is: \n" + min(numbers));
    }

    public static void exHandleNumbers() {
        int number1 = inputInt();
        int number2 = inputInt();
        int number3 = inputInt();

        printIfEven(number1);
        printIfEven(number2);
        printIfEven(number3);

        printMaxLength(number1.length(), number2.length(), number3.length());
        printMinLength(number1.length(), number2.length(), number3.length());
    }

    public static double distance(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static int inputNumberInt() {
        System.out.println("Entre a number:");
        return input.nextInt();
    }

    public static void printMaxNumber() {
        int number1 = inputNumberInt();
        int number2 = inputNumberInt();
        int number3 = inputNumberInt();
        int number4 = inputNumberInt();
        int number5 = inputNumberInt();

        System.out.println("The biggest number is: " + max(number1, number2, number3, number4, number5));
    }

    public static void printYetter() {
        double side1 = inputNumberInt();
        double side2 = inputNumberInt();
        System.out.print("The third side is:" + distance(side1, side2));
    }
}
