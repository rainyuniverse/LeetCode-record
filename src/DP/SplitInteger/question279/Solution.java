package DP.SplitInteger.question279;

/**
 * 执行用时：21 ms, 在所有 Java 提交中击败了89.17%的用户
 * 内存消耗：40.5 MB, 在所有 Java 提交中击败了35.01%的用户
 */
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; j++){
//                if(1 + dp[i - j*j] < min){
//                    min = 1 + dp[i - j*j];
//                }
                min = Math.min(min, 1 + dp[i - j*j]);
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
