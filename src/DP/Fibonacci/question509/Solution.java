package DP.Fibonacci.question509;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了5.14%的用户
 */
class Solution {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        if(n == 0){
            return 0;
        }
        dp[0] = 0;
        if(n == 1){
            return 1;
        }
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
