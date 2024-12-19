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

    // exceptions section

    public static void checkIllegalArgumentException(int number, int illegalArgument) throws IllegalAccessException {
        if (number == illegalArgument){
            throw new IllegalAccessException("noughty noghty");
        }
    }

    public static void exerciseExceptions() throws RuntimeException, IllegalAccessException {
        int inputNumber = inputNumber();
        while (inputNumber != 100){
            try{
                checkIllegalArgumentException(inputNumber, 45);
            } catch (IllegalAccessException exception) {
                System.out.println("that was a close one, IllegalAccessException was caought");
            }
            inputNumber = inputNumber();
        }
        throw new RuntimeException("WHAT ARE YOU DOING!!! ITS 100!!!!");
    }
}
