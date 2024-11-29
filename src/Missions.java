import java.util.*;
public class Missions {
    public static Scanner input = new Scanner(System.in);
    public static void ex1(double n1, double n2, double n3){
        System.out.println((n1 + n2 + n3) / 3);
    }

    public static void ex2(double n1, double n2){
        if (n1 % 2 == 0 && n2 % 2 == 0) {
            System.out.println("Both numbers are even");
        } else {
            System.out.println("Womp Womp not both of the numbers are even");
        }
        if ((n1 + n2) / 2 > n1){
            System.out.println("No way!!! the average is bigger then Herman's bana-sorry i meant the first number");
        } else {
            System.out.println("The average is smaller then the second number");
        }
    }

    public static void ex3(int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3){
            System.out.println(n1);
        } else if (n2 > n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }

    public static void ex4(){
        System.out.println("Enter the amount of money bank 1 has: ");
        int b1 = input.nextInt();
        System.out.println("Enter the amount of money bank 2 has: ");
        int b2 = input.nextInt();
        System.out.println("Enter the amount of money bank 3 has: ");
        int b3 = input.nextInt();
        if (b1 > b2 && b1 > b3){
            System.out.println(b1);
        } else if (b2 > b3) {
            System.out.println(b2);
        } else {
            System.out.println(b3);
        }

        System.out.println("Enter three number in three different lines");
        String n1 = input.next();
        String n2 = input.next();
        String n3 = input.next();

        int l1 = n1.length();
        int l2 = n2.length();
        int l3 = n3.length();

        if (l1 % 2 == 0){
            System.out.println("the length of the number " + n1 + " is even");
        }
        if (l2 % 2 == 0){
            System.out.println("the length of the number " + n2 + " is even");
        }
        if (l3 % 2 == 0){
            System.out.println("the length of the number " + n3 + " is even");
        }

        System.out.print("the number with the most amount of digits is: ");
        if (l1 > l2 && l1 > l3){
            System.out.println(n1);
        } else if (l2 > l3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

        System.out.print("the number with the least amount of digits is: ");
        if (l1 < l2 && l1 < l3){
            System.out.println(n1);
        } else if (l2 < l3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }
}
