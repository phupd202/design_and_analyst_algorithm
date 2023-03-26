package hw4_20001958.ex3;

import java.util.Arrays;
import java.util.Random;

/*
 * Ý tưởng: Sử dụng quick sort để sắp xếp dãy gồm n giá trị
 * Do thuật toán quick sort sử dụng phương pháp chia để trị --> dộ phức tạp O(nlog(n))
 * Lần lượt lấy ra giá trị min và max ở đầu và cuối --> độ phức tap O(1)
 */
public class FindMinMax {
    public static <T extends Comparable<T>> int partition(T[] a, int l, int r) {
        int i = l;
        int j = r + 1;

        int pivot = l;

        while(true) {
            while(a[++i].compareTo(a[pivot]) < 0) 
                if(i == r) break;
            while(a[--j].compareTo(a[pivot]) > 0)
                if(j == l) break;

            if(i >= j) break;
            swap(a, i, j);
        }
        swap(a, pivot, j);
        return j;
    }

    public static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T extends Comparable<T>> void quickSort(T[] a, int left, int right) {
        if(left < right) {
            int idxPart = partition(a, left, right);
            quickSort(a, left, idxPart - 1);
            quickSort(a, idxPart + 1, right);

        }
    }

    public static Integer[] creArray(int n, Random generator) {
        Integer[] a = new Integer[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(100);
            
        }
        return a;
    }

    public static void main(String[] args) {
        // Integer a[] = {10, 9, 8, 7, 6, 5};

        // // // test partition
        // // System.out.println(partition(a, 0, a.length - 1));
        // // System.out.println(Arrays.toString(a));

        // quickSort(a, 0, a.length - 1);
        // System.out.println(Arrays.toString(a));

        // System.out.println("Min elememt: " + a[0]);
        // System.out.println("Max element: " + a[a.length - 1]);

        Random generator = new Random();

        // đo thời gian
        for (int i = 0; i < 15; i++) {
            // cre Matrix
            int n = (int) Math.pow(2, i);
            Integer[] a = creArray(n, generator);

            long startTime = System.nanoTime();
            quickSort(a, 0, n - 1);
            int min = a[0];
            int max = a[n-1];
            long endTime = System.nanoTime();
            long time = endTime - startTime;

            System.out.println("Với n = " + n);
            System.out.println("Thời gian chạy của thuật toán là: " + time);
            
        }

    }

}
