package home_work_3.ex2;

import java.util.Scanner;

public class PresentBinary {
    public static void toBinary(int n) {
        // base case
        if (n < 2) {
            System.out.print(n);
        } else {
            toBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long startTime = System.nanoTime();
        toBinary(n);
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) * Math.pow(10, -9));

    }
}
