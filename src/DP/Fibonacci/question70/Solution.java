package DP.Fibonacci.question70;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.3 MB, 在所有 Java 提交中击败了10.86%的用户
 */
class Solution {
    public int climbStairs(int n) {
        //dp[i]代表上到第i阶楼梯有dp[i]种方法
        int[] dp = new int[n + 1];
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        //dp数组初始化
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
