package by.shcherba;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a[%d]:", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("The prime numbers are with indexes:");
        System.out.println(arrayPrimeNumbers(arr));
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> arrayPrimeNumbers(int[] arr) {
        int len = arr.length;
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (isPrime(arr[i])) {
                indexes.add(i);
            }
        }
        return indexes;
    }

}
