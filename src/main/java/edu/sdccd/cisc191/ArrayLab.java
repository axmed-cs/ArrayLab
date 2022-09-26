package edu.sdccd.cisc191;

/**
 * CISC191 2.3 Multidimensional Arrays - Junior
 * @author Ahmed Abdullahi
 */


public class ArrayLab {
    /**
     * @param args command line parameters
     */
    public static void main(String[] args) {
        int[][] spreadsheet = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Max: " + max(spreadsheet));
        System.out.println("Sum of row 0: " + rowSum(spreadsheet, 0));
        System.out.println("Sum of col 0: " + columnSum(spreadsheet, 0));
        int[] rowSums = allRowSums(spreadsheet);
        for (int row = 0; row < rowSums.length; row++) {
            System.out.println("Sum of row " + row + ": " + rowSums[row]);
        }

    }

    /**
     * @param a 2D array
     * @return the maximum value in the 2d parameter array a
     */
    public static int max(int[][] a) {

        // Setting the max to row 0 column 0
        int max = a[0][0];

        //if there exists a number greater than the current max a[0][0]
        // then set it as the new max
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) max = a[i][j];
            }
        }

        return max;
    }

    /**
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {

        // totalSum will hold the total sum for row x of a
        int totalSum = 0;

        //loop that prints out the row sum
        //a[x].length reads length of the row and the loop reiterates until it reaches the length
        for (int i = 0; i < a[x].length; i++) {
            totalSum += a[x][i];
        }
        return totalSum;
    }

    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {

        //totalSum will hold the total sum for the column x of a
        int totalSum = 0;

        //loop that will get the total sum for each column x of a
        for (int i = 0; i < a.length; i++) {
            if(a[i].length > x )
                totalSum += a[i][x];

        }

            return totalSum;
    }

    /**
     * @param a 2D array
     * @return calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
     */
    public static int[] allRowSums(int[][] a) {

        //array rowSums made to have same length as a
        int[] rowSums = new int[a.length];

        //for loops to compute the sum of each row
       for(int i = 0; i < a.length; i++){
           for(int j = 0; j< a[i].length; j++){
               rowSums[i] += a[i][j];
           }
       }
        return rowSums;

    }
    }

