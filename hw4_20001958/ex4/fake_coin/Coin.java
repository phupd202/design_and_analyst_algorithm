package hw4_20001958.ex4.fake_coin;

import java.util.Random;
import java.util.Scanner;

public class Coin {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create an array of n coins with a fake coin at a random position
        int[] coins = {0, 1, 0, 1, 1, 1, 1};
        
        
        // Find the fake coin using divide and conquer
        int fakeCoin = findFakeCoin(coins, 0, 7);
        System.out.println("The fake coin is at index " + fakeCoin);
    }
    
    // Recursive function to find the fake coin in a subarray
    private static int findFakeCoin(int[] coins, int left, int right) {
        if (left == right) {
            return left;
        } else {
            int mid = (left + right) / 2;
            int leftSum = sum(coins, left, mid);
            int rightSum = sum(coins, mid+1, right);
            if (leftSum > rightSum) {
                return findFakeCoin(coins, left, mid);
            } else {
                return findFakeCoin(coins, mid+1, right);
            }
        }
    }
    
    // Helper function to compute the sum of a subarray
    private static int sum(int[] coins, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += coins[i];
        }
        return sum;
    }
}
