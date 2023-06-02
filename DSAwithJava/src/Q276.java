
import java.util.*;
import java.io.*;
import java.lang.*;
public class Q276 {
    //{ Driver Code Starts
//Initial Template for Java
    class Driver_class
    {
        public static void main(String args[])
        {

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                int grid[][] = new int[9][9];
                for(int i = 0; i < 9; i++)
                {
                    for(int j = 0; j < 9; j++)
                        grid[i][j] = sc.nextInt();
                }

                Solution ob = new Solution();

                if(ob.SolveSudoku(grid) == true)
                    ob.printGrid(grid);
                else
                    System.out.print("NO solution exists");
                System.out.println();

            }
        }
    }




// } Driver Code Ends


//User function Template for Java

    private static class Solution
    {
        static boolean isSafe(int row, int column, int grid[][], int num) {
            int n = grid.length;
            for (int j=0; j<n; j++) {
                if (num == grid[row][j]) return false;
            }
            for (int i=0; i<n; i++) {
                if (num == grid[i][column]) return false;
            }
            n = (int) Math.sqrt(n);
            int startR = (row/n)*n, startC = (column/n)*n;
            for (int i=startR; i<startR+n; i++) {
                for (int j=startC; j<startC+n; j++) {
                    if (num == grid[i][j]) return false;
                }
            }
            return true;
        }
        static boolean SolveSudoku(int row, int column, int grid[][]) {
            int n = grid.length;
            if (row == n) return true;
            if (column == n) return SolveSudoku(row+1, 0, grid);
            if (grid[row][column] == 0) {
                for (int i=1; i<=n; i++) {
                    if (isSafe(row, column, grid, i)) {
                        grid[row][column] = i;
                        boolean isSolved = SolveSudoku(row, column+1, grid);
                        if (isSolved) return true;
                    }
                }
            } else {
                return SolveSudoku(row, column+1, grid);
            }
            grid[row][column] = 0;
            return false;
        }
        //Function to find a solved Sudoku.
        static boolean SolveSudoku(int grid[][])
        {
            // add your code here
            return SolveSudoku(0, 0, grid);
        }

        //Function to print grids of the Sudoku.
        static void printGrid (int grid[][])
        {
            // add your code here
            int n = grid.length;
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    System.out.print(grid[i][j]+ " ");
                }
            }
        }
    }
}
