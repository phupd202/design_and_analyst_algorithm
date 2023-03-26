package warm_up;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        // Init random
        Random generator = new Random();

        // cre matrix (random)
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(100);
        }

        // before sort
        System.out.println(Arrays.toString(arr));

        // After Sort
        mergeSort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        }

        // merge 2 array
        public static void merge(int[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;

            // copy to 2 subarray
            int[] lArray = new int[n1];
            int[] rArray = new int[n2];


            for (int i = 0; i < n1; ++i) {
                lArray[i] = arr[l + i];
            }

            for (int j = 0; j < n2; ++j) {
                rArray[j] = arr[m + 1 + j];
            }

            int i = 0, j = 0;
            int k = l;

            // merge
            while (i < n1 && j < n2) {
                if (lArray[i] <= rArray[j]) {
                    arr[k++] = lArray[i++];
                } else {
                    arr[k++] = rArray[j++];
                }
            }

            // khi không còn các cặp để so sánh, copy các phần tử còn lại
            while (i < n1) {
                arr[k++] = lArray[i++];
            }

            while (j < n2) {
                arr[k++] = rArray[j++];
            }
        }
    //sort 
    public static void mergeSort(int[] array, int l, int r) {
        int m = l + (r - l) / 2;

        if (l < r) {
            // mergesort
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);
            merge(array, l, m , r);
        }
        
    }
}
