package com.company;

public class ArrayCalculations {

    public static int rowSum(int[][] arr, int row) {
        int sum = 0;
        if (row > arr.length || row <= 0) {
            return -1;
        }
        for (int col = 0; col < arr[0].length; col++) {
            sum += arr[row][col];
        }
        return sum;
    }

    public static int columnSum(int[][] arr, int col) {
        int sum = 0;
        if (col > arr[0].length || col <= 0) {
            return -1;
        }
        for (int row = 0; row < arr.length; row++) {
            sum += arr[row][col];
        }
        return sum;
    }

    public static int diagonalSum(int[][] arr, int direction) {
        int sum = 0;
        if (direction == 0) {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++) {
                    sum += arr[row][col];
                    {
                        row++;
                    }
                }
            }
        } else if (direction == 1) {
            for (int row2 = 0; row2 < arr.length; row2++) {
                for (int col2 = arr[0].length - 1; col2 >= 0; col2--) {
                    sum += arr[row2][col2];
                    {
                        row2++;
                    }

                }
            }

            return sum;
        }

        else
            sum=-1;
        return sum;
    }
}
