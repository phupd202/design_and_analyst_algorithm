package Ex3_20001958_PhamDuyPhu;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseStr("Phu"));
        
    }
    public static String reverseStr(String s) {
       int n = s.length();
       String revString = "";
        

       if(s.length() == 1) {
            return revString += s;
       } else {
            revString += s.charAt(n-1);
            // thu nhỏ kích thước của string
            return revString + reverseStr(s.substring(0, n - 1));
       }
    }


}