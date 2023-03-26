package warm_up;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Giả sử:
 * index          0   1  2  3  4
 * inputArray[] = [5, 4, 1, 6, 7]
 * build heap bắt đầu từ index 1
 *                   1  2  3  4  5
 * heap[]       = [, 5, 4, 1, 6, 7]
 */

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        // In
        int input[] = new int[n];
        Random generator = new Random();
        for (int i = 0; i < input.length; i++) {
            input[i] = generator.nextInt(100);
        }
        
        // before sort
        System.out.println(Arrays.toString(input));

        // buil heap
        heapify(0, n - 1, input);

        //heapSort
        heapSort(input, n - 1);
        System.out.println(Arrays.toString(input));
    }

    public static void heapify(int k, int n, int[] heap) {
        
        while(k < (n - 1) / 2) {
            int j = 2 * k + 1;
            if(j < n && heap[j] < heap[j + 1]) j++;
            if(heap[k] < heap[j]) break;

            //swap 2 node
            int temp = heap[k];
            heap[k] = heap[j];
            heap[j] = temp;
            k = j;
        }

    }

    
    public static void heapSort(int heap[], int n) {

        while(n > 0) {
            int temp = heap[0];
            heap[0] = heap[n];
            heap[n] = temp;

            heapify(1, n - 1, heap);
        }

    }
}
