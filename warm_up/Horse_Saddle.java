package warm_up;
import java.util.Scanner;

class Hours_Saddle {
    public static void main(String[] args) {

        // Input matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter the column of matrix: ");
        int col = sc.nextInt();

        // Init matrix 
        int matrix[][] = new int[row][col];

        // Enter elements of the matrix
        System.out.println("Enter elements: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        // find horse saddle point of the matrix
        int count = 0; 
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == minRow(matrix, i) && matrix[i][j] == maxCol(matrix, j)){
                    System.out.println("Element " + matrix[i][j] + " at position " + "(" + i + ", " + j + ")" + " is a horse saddle point of the matrix");
                    count++;
                }
            }
        }

        System.out.println("There are " + count + " horse saddle point in the matrix");

    }

    // find max element of the rows
    public static int minRow(int[][] matrix, int k) {
        int col = matrix[0].length;
        int min = matrix[k][0];

        for(int i = 0; i < col; i++) {
            if (matrix[k][i] <= min) {
                 min = matrix[k][i];
            }
        }
        return min;
    }

    // find min element of the col
    public static int maxCol(int[][] matrix, int k) {
        int row = matrix.length;
        int max = matrix[0][k];

        for (int i = 0; i < row; i++) {
            if (matrix[i][k] >= max) {
                max = matrix[i][k];
            }
        }
        return max;
    }
}