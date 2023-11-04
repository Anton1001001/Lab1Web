package by.shcherba;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter h:");
        int h = scanner.nextInt();
        calculateFunction(a, b, h);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(tan(1));
        System.out.println(tan(2));
        System.out.println(tan(3));

    }

    public static void calculateFunction(int a, int b, int h){
        for (int i = a; i <= b; i += h) {
            System.out.printf("%d   %.3f\n", i, tan(i));
        }
    }

    public static double tan(int x) {
        return sin(x) / cos(x);
    }
}
