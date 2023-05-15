package LT7_20001958_PhamDuyPhu;

// chúng ta có thê cải thiện bài toán trên bằng quy hoạch động
public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println(exercise_2(2));
        
    }

    public static double exercise_2(int n) {
        double[][] table_result = new double[n + 1][n + 1];
        double sum = 0;

        table_result[0][0] = 2;
        table_result[1][1] = 2;

        for (int i = 2; i < table_result.length; i++) {
            for (int j = 2; j < table_result.length; j++) {
                table_result[i][j] += 2 * table_result[i - 1][j - 1] * table_result[i - 2][j - 2];
            }
        }
        return table_result[n][n];

    }
    
}
