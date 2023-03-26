package warm_up;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input size
    System.out.println("Enter size of the sequence: ");
    int n = sc.nextInt();

    // Init Random
    Random generator = new Random();
        
    // Cre sequence
    int select[] = new int[n];
    for (int i = 0; i < select.length; i++) {
        select[i] = generator.nextInt(100) + 1;
    }

    // before sort with selection sort
    for (int i = 0; i < select.length; i++) {
        System.out.print(select[i] + " ");
    }

    System.out.println();

    // after sort
    selectionSort(select);
    for (int i = 0; i < select.length; i++) {
        System.out.print(select[i] + " ");
    }
    }

    public static void selectionSort(int[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                if (matrix[i] > matrix[j]) {
                    int swap = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = swap;
                }
            }
            
        }
    }

}
