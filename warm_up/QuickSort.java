package warm_up;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        // cre Array
        int array[] = new int[n];
        Random generator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
        }
       
        // Before sort
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, n - 1);
        System.out.println(Arrays.toString(array));
    }

    // partition
    public static int partition(int[] arr, int l, int r) {
        int i = l - 1;
        int j = r + 1;
        int pivot = arr[l];
    
        while (true) {
            while (arr[++i] < pivot); // đi từ bên trái sang nếu nhỏ hơn pivot thì tiếp tực
            while (arr[--j] > pivot); // đi từ bên trái sang nếu lớn hợn pivot thì tiếp tục
    
            if (i >= j) {
                return j;
            }  
             // Nếu tìm được vị trí thì tráo
             swap(arr, i, j);
            
        }
    }
    // swap
    public static void swap(int matrix[], int i, int j) {
        int temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;
    }

    // //print array
    // public static void printArray(int[] matrix) {
    //     for (int i = 0; i < matrix.length; i++) {
    //         System.out.print(matrix[i] + " ");
    //     }
    //     System.out.println();
    // }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int partition = partition(arr, l, r);
            quickSort(arr, l, partition);
            quickSort(arr, partition + 1, r);
        }
    }
}
