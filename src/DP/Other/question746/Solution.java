package DP.Other.question746;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.3 MB, 在所有 Java 提交中击败了5.07%的用户
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 2];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i < cost.length + 1; i++){
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
