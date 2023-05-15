package test;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(char[] seq) {
        int n = seq.length;

        for (int i = n - 1; i > 0; i--) {
            System.out.println("Loop " + (n - i)+ " :");

            for (int j = 1; j <= i; j++) {

                if (seq[j - 1] >= seq[j]) {
                   System.out.println("�?i ch? " + seq[j - 1] + " v?i " + seq[j]);
                   char swap = seq[j - 1];
                   seq[j - 1] = seq[j];
                   seq[j] = swap;
                } else {
                    System.out.println("Kh�ng �?i ch? v? " + seq[j - 1] + " < " + seq[j]);
                }

            }
            System.out.println("Mảng sau bước thứ " + (n - i) + Arrays.toString(seq));

        }

    }
    public static void main(String[] args) {
        char[] words = {'H', 'O', 'M', 'E', 'W', 'R', 'K'};
        bubbleSort(words);
    }
}
