import java.util.Scanner;
public class Missions {
    final public static Scanner scanner = new Scanner(System.in);

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

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int getMinIndex(int[] array) {
        int minPointer = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minPointer]) {
                minPointer = i;
            }
        }
        return minPointer;
    }

    public static void switchArrayValues(int[] array, int firstIndex, int secondIndex) {
        array[firstIndex] += array[secondIndex];
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex] -= array[secondIndex];
    }

    public static void flipArray(int[] array) {
        for (int startIndex = 0; startIndex < array.length / 2; startIndex++) {
            switchArrayValues(array, startIndex, array.length - startIndex - 1);
        }
    }

    public static void exHandle(int[] array) {
        if (isEven(getMinIndex(array))) {
            System.out.println(array[getMinIndex(array)]);
        }
        flipArray(array);
    }
}
