package LT7_20001958_PhamDuyPhu;

public class Exercise_5 {
    public static void main(String[] args) {
        double input[] = {-2, 11, -4, 13, -5, 2};
        System.out.println(exercise_6(input));
    }

    // T(n) max = T(n-1)max + T[n]
    public static double exercise_6(double[] input) {
        double sum = input[0];
        double max = input[0];

        for (int i = 1; i < input.length; i++) {
            sum = Math.max(input[i], input[i] + sum);
            max = Math.max(max, sum);
        }
        return max;
    }

    public static double exercise_4(double[] input) {
        double maxSum = Double.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                for (int j2 = 0; j2 < j + 1; j2++) {
                    sum += input[j2];
                    maxSum = Math.max(maxSum, sum);   
                }
            }
            
        }
        return maxSum;
    }


    public static double exercise_5(double[] input) {
        int n = input.length;
        double maxSum = 0;

        for (int i = 0; i < input.length; i++) {
            int sum = 0;
            for (int j = i; i < n; j++) {
                sum += input[i];
                maxSum = Math.max(maxSum, sum);
                
            }
        }
        return maxSum;
    }

    public static double exercise_7(double[] input) {
        double maxSum = Double.MAX_VALUE;
        double sum = 0;
        
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            if(sum > maxSum) {
                maxSum = sum;
            } else {
                maxSum = 0;
            }

        }
        return maxSum;
    }

    public static double exercise_1(int n) {
        if( n == 0 || n == 1) {
            return 2;
        } else {
            return exercise_1(n) + 2 * exercise_1(n - 1) * exercise_1(n - 2);
        }

    }
    
}
