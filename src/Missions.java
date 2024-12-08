public class Missions {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int minPointer(int[] array) {
        int minPointer = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minPointer]) {
                minPointer = i;
            }
        }
        return minPointer;
    }

    public static void flipArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array[array.length - 1 - i] += array[i];
            array[i] = array[array.length - 1 - i] - array[i];
            array[array.length - 1 - i] -= array[i];
        }
    }

    public static void printArray(int[] array){
        String message = "[ ";
        for (int number: array){
            message += number + ", ";
        }
        message += "]";
        System.out.println(message);
    }

    public static void exHandle(int[] array) {
        System.out.println(isEven(minPointer(array)) ? array[minPointer(array)] : "");
        flipArray(array);
    }
}
