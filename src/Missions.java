import java.util.Scanner;

public class Missions {
    public static Scanner scanner = new Scanner(System.in);

    public static int inputNumber(){
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }

    public static int maxNumber(){
        int number = inputNumber();
        int max = Integer.MIN_VALUE;

        while (number != 0) {
            max = Math.max(max, number);
            number = inputNumber();
        }
        return max;
    }

    public static void printMaxNumber() {
        System.out.println(maxNumber());
    }
}
