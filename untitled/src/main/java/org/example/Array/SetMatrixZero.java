package org.example.Array;

import java.util.Arrays;

public class SetMatrixZero {

    public static void setZeroes(int[][] matrix) {
        int m= matrix.length; int n=matrix[0].length;
        boolean firstRowZero=false, firstColZero=false;

        for (int i=0;i<n;i++) if (matrix[0][i]==0) firstRowZero=true;
        for (int j=0;j<m;j++) if (matrix[j][0]==0) firstColZero=true;

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (matrix[i][0]==0 || matrix[0][j] ==0){
                    matrix[i][j]=0;
                }
            }
        }

        if (firstRowZero) for (int j=0;j<n;j++) matrix[0][j]=0;
        if (firstColZero) for (int i=0;i<m;i++) matrix[i][0]=0;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[]args){
       int[][]matrix= {{1,1,1},{1,0,1},{1,1,1}};
       int[][]matrix1={{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("Matrix After Setting Zeroes:");
        printMatrix(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix1);

        setZeroes(matrix1);

        System.out.println("Matrix After Setting Zeroes:");
        printMatrix(matrix1);
    }
}
