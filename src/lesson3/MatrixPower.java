package lesson3;

import java.util.Scanner;

public class MatrixPower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimension of the square matrix A: ");
        int dim = scanner.nextInt();

        int[][] a = new int[dim][dim];
        int[][] b = new int[dim][dim];
        int[][] c = new int[dim][dim];

        // Input elements of matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize matrix b with the elements of matrix A
        for (int i = 0; i < dim; i++) {
            System.arraycopy(a[i], 0, b[i], 0, dim);
        }

        // Calculate A^n and store the result in matrix c
        for (int k = 2; k <= n; k++) {
            multiplyMatrices(c, b, a, dim);
            // Copy the result back to matrix b for the next iteration
            for (int i = 0; i < dim; i++) {
                System.arraycopy(c[i], 0, b[i], 0, dim);
            }
        }

        // Display the result matrix A^n
        System.out.println("Matrix A^" + n + ":");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void multiplyMatrices(int[][] result, int[][] matrix1, int[][] matrix2, int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                int sum = 0;
                for (int k = 0; k < dim; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
    }
}
