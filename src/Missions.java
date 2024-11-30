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

    public static void ex1(double number1, double number2, double number3) {
        System.out.println(average(number1, number2, number3));
    }

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }

    public static void ex2A(double number1, double number2) {
        if (isEven(number1) && isEven(number2)) {
            System.out.println("Both numbers are even");
        } else {
            System.out.println("Womp Womp not both of the numbers are even");
        }
    }

    public static void ex2B(double number1, double number2) {
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

    public static void ex3(int number1, int number2, int number3) {
        System.out.println(max(number1, number2, number3));
    }

    public static void ex4() {
        System.out.println("Enter the amount of money bank 1 has: ");
        int bank1 = input.nextInt();
        System.out.println("Enter the amount of money bank 2 has: ");
        int bank2 = input.nextInt();
        System.out.println("Enter the amount of money bank 3 has: ");
        int bank3 = input.nextInt();
        System.out.println(max(bank1, bank2, bank3));

        System.out.println("Enter three number in three different lines");
        String number1 = input.next();
        String number2 = input.next();
        String number3 = input.next();

        int l1 = number1.length();
        int l2 = number2.length();
        int l3 = number3.length();

        if (isEven(l1)) {
            System.out.println("the length of the number " + number1 + " is even");
        }
        if (isEven(l2)) {
            System.out.println("the length of the number " + number2 + " is even");
        }
        if (isEven(l3)) {
            System.out.println("the length of the number " + number3 + " is even");
        }

        System.out.print("the number with the most amount of digits is: ");
        System.out.println(max(l1, l2, l3));

        System.out.print("the number with the least amount of digits is: ");
        System.out.println(min(l1, l2, l3));
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
