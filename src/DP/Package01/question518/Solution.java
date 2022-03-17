package DP.Package01.question518;

/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了99.94%的用户
 * 内存消耗：39 MB, 在所有 Java 提交中击败了36.50%的用户
 */
class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        //区分遍历顺序 首先遍历硬币数组 其次遍历金额总量 求组合数的方案
        //加入修改遍历顺序 则是求排列数的方案
        for(int i = 0; i < coins.length; i++){
            for(int j = coins[i]; j < amount + 1; j++){
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }

        return dp[amount];
    }
}
