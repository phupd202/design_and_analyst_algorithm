package test;

import java.util.Arrays;

public class Test {
    public static void selectionSort(char[] words) {
        int n = words.length;
        int idxMax = 0;

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(words[j] > words[idxMax]) idxMax = j;
            }
            
            System.out.println("Phần tử lớn nhất của lần thứ " + (n - i) + " là: " + words[idxMax]);
            System.out.println("Đổi chỗ " + words[idxMax] + " với " + words[i]);
            char temp = words[idxMax];
            words[i] =  words[idxMax];
            words[idxMax] = temp;
            
        }

    }
    public static void main(String[] args) {
        char[] words = {'H', 'O', 'M', 'E', 'W', 'R', 'K'};
        selectionSort(words);
        System.out.println(Arrays.toString(words));
    }
}
