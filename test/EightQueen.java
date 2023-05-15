package test;

public class EightQueen {
    public static void main(String[] args) {
        // Khởi tạo ma trận boolean lưu trạng thái của các quân hậu
        boolean[][] chess = new boolean[8][8];

        // Init with false
        int n = chess.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = false;
            }

        }

        // List storage status
        int[][] status = new int[8][2];

        // solve
        solution(chess, status);

        // In bàn cờ
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    static boolean[][] solution(boolean[][] chess, int[][] status) {
        // Xếp quân hậu đầu vào vị trị i = 0, j = 0
        chess[0][0] = true;
        status[0][0] = 0;
        status[0][1] = 0;

        int count = 1;

        // vét cạn
        int n = chess.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = false;

                // xét hàng, cột
                for (int k = 0; k < count; k++) {
                    if(i == status[k][0] && j == status[k][1]) break;
                    else flag = true;
                }

                // xét đường chéo
                if(flag == true) {
                    for (int k = 0; k < status.length; k++) {
                        int rowCurrent = status[k][0];
                        int colCurrent = status[k][1];

                        int numCross;
                        if(rowCurrent > colCurrent) {
                            rowCurrent = rowCurrent - colCurrent;
                            colCurrent = 0;
                            numCross = 8 - rowCurrent;
                        } else {
                            rowCurrent = 0;
                            colCurrent -= rowCurrent;
                            numCross = 8 - colCurrent;
                        }

                        for (int l = 0; l < numCross; l++) {
                            if(i == rowCurrent + k && j == colCurrent + k) flag = true;
                            else flag = false;
                            
                        }
                        
                    }
                }
                
                // Sau khi xét đường chéo và hàng, cột mà flag vẫn true, chính tỏ thoả mãn, add vào mảng status
                status[count][0] = i;
                status[count][1] = j;
                count++;// số lượng các trạng được lưu hiện tại
                chess[i][j] = false;
            }
        }
        return chess;
    } 
}

// Phiên bản tự viết cho bài toan 8 hậu, chưa đúng kết quả
