package Ex3_20001958_PhamDuyPhu;

public class PrintPrime {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int n) {
       if(n == 2) {// base case
        System.out.println(2);
       } else {
            if(isPrime(n)) {
                System.out.println(n);
            }
            print(n - 1);

       }

    }

    //check prime
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
