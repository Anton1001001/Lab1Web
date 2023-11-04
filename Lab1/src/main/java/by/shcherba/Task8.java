package by.shcherba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter A[%d]:", i);
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter m:");
        int m = scanner.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.printf("Enter B[%d]:", i);
            B[i] = scanner.nextInt();
        }
        int[] arr = mergeArrays(A, B);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] mergedArray = new int[n + m];

        int i = 0;
        int j = 0;
        int z = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                mergedArray[z] = a[i];
                i++;
            } else {
                mergedArray[z] = b[j];
                j++;
            }
            z++;
        }

        while (i < n) {
            mergedArray[z] = a[i];
            i++;
            z++;
        }

        while (j < m) {
            mergedArray[z] = b[j];
            j++;
            z++;
        }

        return mergedArray;
    }
}
