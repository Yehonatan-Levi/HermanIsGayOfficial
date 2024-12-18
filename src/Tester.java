public class Tester {
    public static void printArray(int[] array) {
        String message = "[ ";
        for (int number : array) {
            message += number + ", ";
        }
        message += "]";
        System.out.println(message);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Missions.exHandle(array);
        printArray(array);
    }
}
