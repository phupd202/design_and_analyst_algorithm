package test;

public class Test {
    public static int[][] addMatrix(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
            
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] c = new int[2][2];
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{1, 2}, {3, 4}};
        c = addMatrix(a, b);

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
