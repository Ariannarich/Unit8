package com.company;
/**
 * @author Arianna Richardson
 * @since April 10th, 2020.
 * This program verifies if a 2D array of integers have the same sum
 * added horizontally, vertically and diagonally, forming a "Magic Square".
 **/

/** Start code:
 *Declares the grid array, the total sum of integers, and the magic boolean(default false) that determines
 * whether or not the grid is a magic square.
 */
public class MagicSquare {
    private int[][] grid;
    private int totalSum;
    private static boolean magic =false;

    /**
     * MagicSquare object constructor.
     * @param g Input of 2D array of integers
     * Assigns parameter to instance variable.
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     *Accessor method that determines if each row in a 2D array have the same sum
     * @param row Number of rows in the 2D array
     * @return sum Returns the sum of the row
     */

    public int rowSum(int row) {
int sum =0;
        magic =false;
        for (int col = 0; col < grid[0].length; col++) {
            sum += grid[row][col];
        }
        if(totalSum == 0)
            totalSum =sum;
        else if(totalSum == sum)
            magic= true;

        return sum;
    }

    /**
     *Accessor method that determines if each column in a 2D array have the same sum
     * @param col Number of rows in the 2D array
     * @return sum Returns the sum of the column
     */
    public int colSum(int col) {
        magic =false;
        int sum =0;

        for (int row = 0; row < grid.length; row++) {
            sum += grid[row][col];
        }
        if(totalSum == 0)
            totalSum =sum;
        else if(totalSum == sum)
            magic= true;
        return sum;
    }

    /**
     *Accessor method that determines if the upward diagonal line of integers in a 2D array have the same sum
     * @return sum Returns the sum
     */
    public int upDiagSum() {
     int sum = 0;
        magic =false;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                sum += grid[row][col];
                row++;
            }
        }
            if(totalSum == 0)
                totalSum =sum;
            else if(totalSum == sum)
                magic= true;

        return sum;
    }

    /**
     *Accessor method that determines if the downward diagonal line of integers in a 2D array have the same sum
     * @return sum Returns the sum
     */
    public int downDiagSum() {
        magic =false;
        int sum = 0;
        for (int row2 = 0; row2 < grid.length; row2++) {
            for (int col2 = grid[0].length - 1; col2 >= 0; col2--) {
                sum += grid[row2][col2];
                row2++;

            }
        }
        if(totalSum == 0)
            totalSum = sum;
        else if(totalSum == sum)
            magic = true;
        return sum;
    }

    /**
     * Accessor method that verifies if a 2D array grid is a magic square.
     * @return magic Returns true or false.
     */
    public boolean isMagicSquare()
    {
return magic;
    }

        /**
         * This method is complete. You do not need to provide additional
         * comments here.
         */
            public void printGrid () {
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    System.out.print(grid[row][col] + "\t");
                }
                System.out.println("");
            }
        }
    }
/**
 * End code:
 */
