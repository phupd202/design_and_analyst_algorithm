package Ex3_20001958_PhamDuyPhu;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sum(-92));
    }

    public static int sum(int n) {
        // iff
        if(n < 0) n = n / (-1);

        // recursion
        int sum = 0;
        if(n < 1) return 0;
        return sum += (n % 10) + sum(n/10);
        
    }
}
