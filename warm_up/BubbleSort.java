package warm_up;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    // Input size
    System.out.println("Enter size of the sequence: ");
    int n = sc.nextInt();

    // Init Random
    Random generator = new Random();
        
    // Cre sequence
    int bubble[] = new int[n];
    for (int i = 0; i < bubble.length; i++) {
        bubble[i] = generator.nextInt(100) + 1;
    }

    // Before sort
    System.out.println("Before use bubble sort: ");
    printMatrix(bubble);

    System.out.println();

    // After sort
    bubbleSort(bubble);
    System.out.println("After use bubble sort");
    printMatrix(bubble);

    }
    
     // bubble sort
     public static void bubbleSort(int[] seq) {
         int n = seq.length;
         for (int i = n - 1; i > 0; i--) {
             for (int j = 1; j <= i; j++) {
                 if (seq[j - 1] >= seq[j]) {
                    int swap = seq[j - 1];
                    seq[j - 1] = seq[j];
                    seq[j] = swap;
                 }
             }
         }
     }

     //print matrix
     public static void printMatrix(int[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
     }


}
