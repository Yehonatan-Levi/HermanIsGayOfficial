public class Missions {
    public static void ex1(double n1, double n2, double n3){
        System.out.println((n1 + n2 + n3) / 3);
    }

    public static void ex2(double n1, double n2){
        if (n1 % 2 == 0 && n2 % 2 == 0) {
            System.out.println("Both numbers are even");
        } else {
            System.out.println("Womp Womp not bouth of the numbers are even");
        }
        if ((n1 + n2) / 2 > n1){
            System.out.println("No way!!! the average is bigger then Herman's bana-sorry i meant the first number");
        } else {
            System.out.println("The average is smaller then the second number");
        }
    }
}
