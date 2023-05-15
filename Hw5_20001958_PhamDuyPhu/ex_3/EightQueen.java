package Hw5_20001958_PhamDuyPhu.ex_3;
/*
 * Đề bài:
 * Đưa ra một cách xếp 8 quân hậu trên bàn cờ vua sao cho không quân nào có thể ăn được quân nào
 */

public class EightQueen {
    public static void main(String[] args) {

        // init matrix save status queen
        int[][] chess = new int[8][8];

        // Init with false
        int n = chess.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 0;
            }

        }

        // List storage status
        int[][] status = new int[8][2];

        // solve
        solution(chess, status, 0);

        // In bàn cờ
        System.out.println("Một phương án cho bài toán 8 hậu: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Lưu ý: Vị trí đánh số 1 là vị trí đặt quân hậu!!!!");
    }

    static boolean solution(int[][] chess, int[][] status, int currentCol) {
        if (currentCol == 8) {
            return true; // Tìm thấy kết quả, dừng đệ quy
        }

        int n = chess.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;

            // Xét ràng buộc cột và đường chéo, cố định cột
            for (int k = 0; k < currentCol; k++) {
                if (i == status[k][0] || status[k][1] == currentCol || Math.abs(i - status[k][0]) == Math.abs(currentCol - status[k][1])) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                status[currentCol][0] = i;
                status[currentCol][1] = currentCol;
                chess[i][currentCol] = 1;
                
                // Đệ quy
                if (solution(chess, status, currentCol + 1)) { 
                    return true;
                }
                chess[i][currentCol] = 0;
            }
        }

        return false; // Không tìm được kết quả
    }
}
