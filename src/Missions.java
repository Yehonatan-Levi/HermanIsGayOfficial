import java.util.Scanner;

public class Missions {
    public static Scanner input = new Scanner(System.in);

    public static void ex() {
        System.out.println("Enter a number:");
        int number = input.nextInt(), max = Integer.MIN_VALUE;

        while (number != 0) {
            max = Math.max(max, number);
            System.out.println("Enter a number:");
            number = input.nextInt();
        }

        System.out.println(max);
    }
}
