package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,99,91,11,44},
                {0,10,9,9,11},
                {0,10,9,9,11},
                {13,4,45,66,33},
                {11,0,1,20,56}
        };

        System.out.println("Before Sort");
        for (int[] is : matrix) {
            for (int i : is) {
                System.out.print(" "+ i);
            }
            System.out.println("");
        }

        for (int k = 0; k < matrix.length; k++) {
            for (int i= 0; i < matrix[k].length; i++) {
                for (int j = 0; j < matrix[k].length; j++) {
                    if (matrix[k][i] < matrix[k][j]) {
                        int temp = matrix[k][i];
                        matrix[k][i] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }

        System.out.println("");
        System.out.println("After Sorting:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // System.out.println(Arrays.deepToString(matrix));
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println("");
        }




    }
}
