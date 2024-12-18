import java.util.Scanner;
public class Util {
    final public static Scanner scanner = new Scanner(System.in);

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

    public static int min(int... numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int inputInt(String request) {
        System.out.println(request);
        return scanner.nextInt();
    }

    public static double inputDouble(String request) {
        System.out.println(request);
        return scanner.nextDouble();
    }

    public static int getNumberLength(int number) {
        int counter = 1;
        while (number > 10) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static double average(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }
}

