package Assigment_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_MatrixMultiplication {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the number of rows for the first matrix: ");
        // int rows1 = sc.nextInt();
        // System.out.print("Enter the number of columns for the first matrix: ");
        // int cols1 = sc.nextInt();

        // System.out.print("Enter the number of rows for the second matrix: ");
        // int rows2 = sc.nextInt();
        // System.out.print("Enter the number of columns for the second matrix: ");
        // int cols2 = sc.nextInt();

        // if (cols1 != rows2||rows1!=cols2) {
        //     System.out.println("Matrix multiplication is not possible");
        //     return;
        // }

        // int[][] matrix1 = new int[rows1][cols1];
        // int[][] matrix2 = new int[rows2][cols2];
        // int[][] result = new int[rows1][cols2];

       
        // System.out.println("Enter the elements of the first matrix:");
        // for (int i = 0; i < rows1; i++) {
        //     for (int j = 0; j < cols1; j++) {
        //         matrix1[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("Enter the elements of the second matrix:");
        // for (int i = 0; i < rows2; i++) {
        //     for (int j = 0; j < cols2; j++) {
        //         matrix2[i][j] = sc.nextInt();
        //     }
        // }

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] matrix2 ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int rows1=matrix1.length;
        int cols1=matrix1[0].length;
        int rows2=matrix2.length;
        int cols2=matrix2[0].length;
        if (cols1 != rows2||rows1!=cols2) {
                System.out.println("Matrix multiplication is not possible");
                return;
            }
        int[][] result = new int[rows1][cols2];

        for(int i=0;i<rows1;i++){
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < rows1; i++) {
           System.err.println(Arrays.toString(result[i]));
        }
    }
}

