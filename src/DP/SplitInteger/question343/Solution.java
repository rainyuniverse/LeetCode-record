package DP.SplitInteger.question343;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38 MB, 在所有 Java 提交中击败了37.51%的用户
 */
class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        dp[2] = 1;
        dp[3] = 2;
        for(int i = 4; i < n + 1; i++){
            int res1 = Math.max(2*dp[i - 2], 3*dp[i - 3]);
            int res2 = Math.max(2*(i-2), 3*(i-3));
            dp[i] = Math.max(res1, res2);
        }
        return dp[n];
    }
}
