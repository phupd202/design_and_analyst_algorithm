package Hw4_20001958.ex3;
/*
 * Nếu giá trị cần tìm xuất hiện trong mảng, trả về vị trí của phần tử
 * Nếu không, trả về -1
 */

import java.util.Random;

public class BinarySearch {
    public static<T extends Comparable<T>> int binarySearch(T[] a, int left, int right, T key) {
        if(left >= right) return left;
        int mid = (right + left) / 2;

        if(key.compareTo(a[mid]) > 0) {
            return binarySearch(a, mid + 1, right, key);
        } 

        if(key.compareTo(a[mid]) <= 0) {
            return binarySearch(a, left, mid - 1, key);
        } 

        if(key.equals(a[mid])) {
            return mid;
        } 
        return -1;
    }


    public static Integer[] creArray(int n, Random generator) {
        Integer[] a = new Integer[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(100);
            
        }
        return a;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Tìm kiếm phàn tử 10 trong mảng
        System.out.println(binarySearch(a, 0,a.length - 1, 10)); // expect 9

        // Random generator = new Random();

        // // đo thời gian
        // for (int i = 0; i < 15; i++) {
        //     // cre Matrix
        //     int n = (int) Math.pow(2, i);
        //     Integer[] a = creArray(n, generator);

        //     long startTime = System.nanoTime();
        //     int key = generator.nextInt(10);
        //     int result = binarySearch(a, 0, n - 1, key);
        //     long endTime = System.nanoTime();
        //     long time = endTime - startTime;

        //     System.out.println("Với n = " + n);
        //     System.out.println("Thời gian chạy của thuật toán là: " + time);
            
        // }

    }
}
 