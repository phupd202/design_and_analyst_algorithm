package hw4_20001958.ex3;

import java.util.Arrays;
import java.util.Random;

public class Strassen {
    public static int[][] strassen(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];

        // Base case
        if (n == 1) {
            c[0][0] = a[0][0] * b[0][0];
        } 
        else {
            int[][] a11 = new int[n / 2][n / 2];
            int[][] a12 = new int[n / 2][n / 2];
            int[][] a21 = new int[n / 2][n / 2];
            int[][] a22 = new int[n / 2][n / 2];

            int[][] b11 = new int[n / 2][n / 2];
            int[][] b12 = new int[n / 2][n / 2];
            int[][] b21 = new int[n / 2][n / 2];
            int[][] b22 = new int[n / 2][n / 2];

            split(a, a11, 0, 0);
            split(a, a12, 0, n / 2);
            split(a, a21, n / 2, 0);
            split(a, a22, n / 2, n / 2);

            split(b, b11, 0, 0);
            split(b, b12, 0, n / 2);
            split(b, b21, n / 2, 0);
            split(b, b22, n / 2, n / 2);

            int[][] M1 = strassen(add(a11, a22), add(b11, b22));
            int[][] M2 = strassen(add(a21, a22), b11);
            int[][] M3 = strassen(a11, sub(b12, b22));
            int[][] M4 = strassen(a22, sub(b21, b11));
            int[][] M5 = strassen(add(a11, a12), b22);
            int[][] M6 = strassen(sub(a21, a11), add(b11, b12));
            int[][] M7 = strassen(sub(a12, a22), add(b21, b22));

            int[][] C11 = add(sub(add(M1, M4), M5), M7);
            int[][] C12 = add(M3, M5);
            int[][] C21 = add(M2, M4);
            int[][] C22 = add(sub(add(M1, M3), M2), M6);

            join(C11, c, 0, 0);
            join(C12, c, 0, n / 2);
            join(C21, c, n / 2, 0);
            join(C22, c, n / 2, n / 2);
        }
        return c;
    }

    // subtract 2 matrix
    public static int[][] sub(int[][] a, int[][] b) {
        int row = a.length;
        int col = a[0].length;

        int[][] c = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                c[i][j] = a[i][j] - b[i][j];
        }
        return c;
    }

    // add 2 matrix
    public static int[][] add(int[][] a, int[][] b) {
        int row = a.length;
        int col = a[0].length;

        int[][] c = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                c[i][j] = a[i][j] + b[i][j];
        }
        return c;
    }

    // split
    public static void split(int[][] source, int[][] dist, int b1, int b2) {
        /*
         * b1, b2: vị trí bắt đầu sao chép
         */

        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                dist[i][j] = source[i + b1][j + b2];
            }

        }
    }

    // join
    public static void join(int[][] source, int[][] dist, int b1, int b2) {
        int n = source.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i + b1][j + b2] = source[i][j];
            }
        }
    }

    public static int[][] creMatrix(int n, Random generator) {
        int[][] a = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = generator.nextInt(10);
            }
            
        }
        return a;
    }

    public static void main(String[] args) {
        // int[][] a = { { 1, 2}, {3, 1}};
        // int[][] b = { { 1, 2 }, { 1, 3 }};

        // int[][] c = new int[2][2];
        // c = strassen(a, b);

        // for (int i = 0; i < c.length; i++) {
        //     for (int j = 0; j < c.length; j++) {
        //         System.out.print(c[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        Random generator = new Random();
        // creMatrix a
        for (int i = 1; i < 9; i++) {
            int[][] a = creMatrix((int)Math.pow(2, i), generator);
            int[][] b = creMatrix((int)Math.pow(2, i), generator);

            long startTime = System.nanoTime();
            int[][] c = strassen(a, b);
            long endTime = System.nanoTime();
            long time = endTime - startTime;
            
            System.out.println("Với kích cỡ ma trận là: n = " + Math.pow(2,i));
            System.out.println("Thời gian thực hiện là: time = " + time);
        }
    }
}