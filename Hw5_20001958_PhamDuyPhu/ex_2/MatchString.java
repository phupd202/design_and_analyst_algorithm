package Hw5_20001958_PhamDuyPhu.ex_2;

import java.util.ArrayList;

public class MatchString {
    public static void main(String[] args) {
        String text = "Phú đẹp trai";
        String pattern = "đẹp trai";
        int n = pattern.length();

        ArrayList<Integer> result;
        result = matchString(text, pattern);
        
        if(result.isEmpty()) System.out.println("Không xuất hiện!!!");
        else {
            System.out.println("Các vị trí xuất hiện của từ " + "\"" + pattern +  "\"" + " là: ");
            for (Integer pos : result) {
                System.out.println("Từ vị trí " + pos + " ----> " + (pos + n - 1));
            }

        }

    }

    static ArrayList<Integer> matchString(String text, String pattern) {

        // Lưu trữ vị trí xuất hiện vào list result
        ArrayList<Integer> result = new ArrayList<Integer>();

        int textLen = text.length();
        int patLen = pattern.length();
        for (int i = 0; i < textLen; i++) {
            int j;
            for (j = 0; j < patLen; j++) {
                if(text.charAt(i + j) != pattern.charAt(j)) break;
            }

            // Nếu j độ dài pattern thì thêm nghiệm vào list result
            if(j == patLen) {
                result.add(i);
            }
            
        }
        return result;
    }
}
