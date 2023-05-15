package LT7_20001958_PhamDuyPhu;

/*
 * Có thể cải thiện hơn nữa về độ phức tạp của exercise 2 bằng cách sử dụng mảng 1 chiều
 */
public class Exercise_3 {
    public static void main(String[] args) {
        System.out.println(exercise_3(2));
        
    }

    public static double exercise_3(int n) {
        double table_result[] = new double[n + 1];
        table_result[0] = 2;
        table_result[1] = 2;

        for (int i = 2; i < table_result.length; i++) {
            table_result[i] += 2 * table_result[i - 1] * table_result[i - 2];
        }
        return table_result[n];
    }
}
