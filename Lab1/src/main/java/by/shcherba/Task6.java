package by.shcherba;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter A[%d]:", i);
            A[i] = scanner.nextInt();
        }
        int[][] matrix = generateMatrix(A);
        printMatrix(matrix);
    }

    public static int[][] generateMatrix(int[] A) {
        int N = A.length;
        int[][] matrix = new int[N][N];
        int shift = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = A[(j + shift) % N];
            }
            shift++;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
