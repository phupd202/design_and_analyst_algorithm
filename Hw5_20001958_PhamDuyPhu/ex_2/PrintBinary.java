package Hw5_20001958_PhamDuyPhu.ex_2;
import java.util.Scanner;

public class PrintBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài dãy nhị phân cần sinh: ");
        int n = sc.nextInt();
        int result[] = new int[n];

        // sinh dãy nhị phân
        binaryList(0, n, result);

    }
    
    public static void binaryList(int i, int n, int[] result) {

        for (int j = 0; j < 2; j++) {
            result[i] = j;
            if(i == (n - 1)) {
                for (int j2 = 0; j2 < n; j2++) {
                    System.out.print(result[j2] + " ");
                }
                System.out.println();
            } else {
                binaryList(i + 1, n, result);
            }
        }

    }
 
}
