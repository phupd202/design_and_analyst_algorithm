package home_work_3.ex2;

public class PrimeFactor {
    
    public static String primeFactors(int n, int div) {
        if (n < 2) {
            return "";
        }
        if (n % div == 0) {
            return div + " " + primeFactors(n/div, div);
        } else {
            return primeFactors(n, div + 1);
        }
        
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        System.out.println(primeFactors(100000000, 2));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) * Math.pow(10, -9));
    }
}
