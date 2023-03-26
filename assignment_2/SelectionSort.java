package assignment_2;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void selectSort(int[] a) {
        int n = a.length;

        // find min element set up at first position
        for (int i = n - 1; i > 0; i--) {
            int idx_max = i;
            for (int j = 0; j < i; j++) {
                if(a[j] > a[idx_max])  {
                    idx_max = j;
                }
                
            }

            // swap
            int temp = a[i];
            a[i] = a[idx_max];
            a[idx_max] = temp;
        }
    }

    public static int[] generator(int[] array) {
        Random rand = new Random();
        int n = array.length;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(n);
        }
        return array;
    }

    public static void main(String[] args) {

        // int[] data = new int[100];
        // data = generator(data);

        // int[] data = new int[200];
        // data = generator(data);

        // int[] data = new int[400];
        // data = generator(data);

        // int[] data = new int[600];
        // data = generator(data);

        // int[] data = new int[800];
        // data = generator(data);

        // int[] data = new int[1000];
        // data = generator(data);
        
        int[] data = new int[1500];
        data = generator(data);

        long startTime = System.nanoTime();
        selectSort(data);
        long endTime = System.nanoTime();

        long totalTime = (endTime - startTime) / 1000;
        System.out.println(totalTime);
    }

}
