package home_work_3.ex3;

import java.util.Arrays;

public class KnapSack {
    public static int solve(int[] p, int[] v, int m, int i, int[] step) {

        // base case
        if( i == 0 || m == 0) {
            return 0;
        }
        
        if(p[i] > m) {
            return solve(p, v, m, i - 1, step);
        } else {
            int pa1 = solve(p, v, m, i - 1, step); // nếu không được cho vào
            int pa2 = solve(p, v, m - p[i], i - 1, step) + v[i]; // nếu được cho vào

            int result = Math.max(pa1, pa2);
            if(result == pa2) { // nếu phần tử i được cho vào balo thì
                step[i] = v[i];
            }

            return result;
        }

    }


    public static void main(String[] args) {
        int[] p = {2, 3, 4, 5, 6};
        int[] v = {6, 9, 12, 15, 19};
        int m = 10;
        int[] step = {0, 0, 0, 0, 0}; // in ra phương an của bài toán, 0 tức là phần tử đó không được lấy
        int result = solve(p, v, 10,p.length - 1,step);
        System.out.println("Giá trị lớn nhất có thể xếp vào balo là: " + result);
        System.out.println("Phương án của bài toán là: " + Arrays.toString(step));
    }
}
