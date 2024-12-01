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

    public static void printAvarage(double number1, double number2, double number3) {
        System.out.println(average(number1, number2, number3));
    }

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }

    public static void isBothEven(double number1, double number2) {
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

    public static int max(int... numbers){
        int max = Integer.MIN_VALUE;
        for (int number: numbers){
            max = Math.max(max, number);
        }
        return max;
    }

    public static int min(int... numbers){
        int min = Integer.MAX_VALUE;
        for (int number: numbers){
            min = Math.min(min, number);
        }
        return min;
    }

    public static void printMax(int number1, int number2, int number3) {
        System.out.println(max(number1, number2, number3));
    }

    public static int bankMoneyAmount(){
        System.out.println("Enter the amount of money the bank has:");
        return input.nextInt();
    }

    public static void maxBankHandle() {
        int bank1 = bankMoneyAmount();
        int bank2 = bankMoneyAmount();
        int bank3 = bankMoneyAmount();
        printMax(bank1, bank2, bank3);
    }

    public static String inputNumber(){
        System.out.println("Enter a number:");
        return input.next();
    }

    public static void printIfEven(String number){
        System.out.print( isEven(number.length()) ? "the length of the number " + number + " is even\n" : "");
    }

    public static int indexOfMax(int... numbers){
        //wait
    }

    public static void printMaxLength(int... numbers){
        System.out.println("the number with the most amount of digits is: \n" + numbers[max(numbers)]);
    }

    public static void printMinLength(int... numbers){
        System.out.println("the number with the least amount of digits is: \n" + numbers[min(numbers)]);
    }

    public static void handleNumbers(){
        String number1 = inputNumber();
        String number2 = inputNumber();
        String number3 = inputNumber();

        printIfEven(number1);
        printIfEven(number2);
        printIfEven(number3);

        printMaxLength(number1.length(), number2.length(), number3.length());
        printMinLength(number1.length(), number2.length(), number3.length());
    }

    public static double pithagorasSentence(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void ex5() {
        System.out.println("Enter 5 numbers in different lines:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        System.out.println("The biggest number is: " + max(number1, number2, number3, number4, number5));

        System.out.println("Enter the smaller sides of a right angle triangle in different lines:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = pithagorasSentence(side1, side2);
        System.out.print("The third side is:" + side3);
    }
}
