package test;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(char[] seq) {
        int n = seq.length;

        for (int i = n - 1; i > 0; i--) {
            System.out.println("Loop " + (n - i)+ " :");

            for (int j = 1; j <= i; j++) {

                if (seq[j - 1] >= seq[j]) {
                   System.out.println("Ð?i ch? " + seq[j - 1] + " v?i " + seq[j]);
                   char swap = seq[j - 1];
                   seq[j - 1] = seq[j];
                   seq[j] = swap;
                } else {
                    System.out.println("Không ð?i ch? v? " + seq[j - 1] + " < " + seq[j]);
                }

            }
            System.out.println("Máº£ng sau bÆ°á»›c thá»© " + (n - i) + Arrays.toString(seq));

        }

    }
    public static void main(String[] args) {
        char[] words = {'H', 'O', 'M', 'E', 'W', 'R', 'K'};
        bubbleSort(words);
    }
}
