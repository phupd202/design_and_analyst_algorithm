package test;

public class De01_20001958 {
    public static void main(String[] args) {
        int v[] = { 6, 2, 5, 2, 1, 1, 1};

        System.out.println("Tống sau khi đã loại bỏ: ");
        System.out.println(getMaxValue(v));

    }

    // partition
    public static int partition(int[] arr, int l, int r) {
        int i = l - 1;
        int j = r + 1;
        int pivot = arr[l];

        while (true) {
            while (arr[++i] > pivot)
                ;
            while (arr[--j] < pivot)
                ;

            if (i >= j) {
                return j;
            }
            // Nếu tìm được vị trí thì tráo
            swap(arr, i, j);

        }
    }

    // swap
    public static void swap(int v[], int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int partition = partition(arr, l, r);
            quickSort(arr, l, partition);
            quickSort(arr, partition + 1, r);
        }
    }

    public static long getMaxValue(int[] v) {

        quickSort(v, 0, v.length - 1);
        int n = v.length;
        long sumArray = 0;
        long min = Integer.MAX_VALUE;
    
        for (int i = 0; i < v.length; i++) {
            sumArray += v[i];
        }
    
        long sumEle = v[0]; // tổng các phần tử liên tiếp bằng nhau
        for (int i = 1; i < n; i++) {
            if (v[i] == v[i - 1]) {
                sumEle += v[i];
            } else {
                if (sumEle < min) {
                    min = sumEle;
                }
                sumEle = v[i];
            }
        }

        // kiểm tra phần tử cuối cùng
        if(sumEle < min) {
            min = sumEle;
        }
        return sumArray - min;
    }
    
    
}
