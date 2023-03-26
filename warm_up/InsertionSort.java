package warm_up;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    // Input
    System.out.println("Enter size of array: ");
    int n = sc.nextInt();

    // Init random
    Random generator = new Random();

    // cre matrix (random)
    int matrix[] = new int[n];
    for (int i = 0; i < matrix.length; i++) {
        matrix[i] = generator.nextInt(100) + 1;
    }

    // before sort with selection sort
    for (int i = 0; i < matrix.length; i++) {
        System.out.print(matrix[i] + " ");
    }

    System.out.println();

    // after sort
    sort(matrix);
    for (int i = 0; i < matrix.length; i++) {
        System.out.print(matrix[i] + " ");
    }

    }

    public static void sort(int matrix[]) {
        int n = matrix.length;

        for (int i = 1; i < n; i++) {
            int key = matrix[i];
            int j = i - 1;

            while (j >= 0 && key < matrix[j]) { // nếu key < matrix[j] thì dịch chuyển, key > matrix[j] thì matrix[j ] = key (swap)
                matrix[j + 1] = matrix[j];
                j = j - 1;
            }
            matrix[j + 1] = key;
        }
    }

    
}
