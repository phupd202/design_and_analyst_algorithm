package Hw4_20001958.ex4.fake_coin;

/*
 * Ý tưởng: Sử dụng phương pháp chia để trị để giải quyết bài toán tìm đồng xu giả, n đồng xu sẽ được mã hoá 
 * PP: Chia n đồng xu thành 2 phần
 * Chia n đồng xu thành 2 phần bằng nhau + phần dư(dư 1 hoặc 0)
 * Cân 2 phần: 
 *  + Nếu 2 phần bàng nhau: đồng xu giả sẽ ở phần dư kia trong trường hợp lẻ, ko có đầu xu giả nếu n chẵn
 *  + Nếu phần nào nhẹ hơn phần còn lại: chứng tở đồng xu giả nằm ở trong phần đó, gọi đệ quy cho phần đó
 *  Input: [1, 0, 1, 1, 1, 1]
 *  Output: 1 - vị trí đồng xu giả
 */

public class FakeCoin {
    public static int findFakeCoin(int[] weights, int l, int r) {

        if(l == r) { // base case
            return l;
        } else {
            int mid = (l + r) / 2;
            int n = r - l + 1; // số lượng các đồng xu

            int sumLeft;
            int sumRight;
            
            if(n % 2 == 0) {
                sumLeft = sumWeight(weights, l, mid);
                sumRight = sumWeight(weights, mid + 1, r);
            } else {
                sumLeft = sumWeight(weights, l, mid - 1);
                sumRight = sumWeight(weights, mid + 1, r);
            }
            
            if(sumLeft < sumRight) {
                return findFakeCoin(weights, l, mid);
            } else if(sumLeft > sumRight) {
                return findFakeCoin(weights, mid + 1, r);
            } else {
                return mid;
            }

        }

    }

    public static int sumWeight(int[] weight,int l, int r) {
        int sum = 0;
        for (int i = l; i < r; i++) {
            sum = sum + weight[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] weights = {1, 0, 1, 1, 1, 1};
        System.out.println(findFakeCoin(weights, 0, weights.length - 1));// expect posiion : 1
    }
    
}
