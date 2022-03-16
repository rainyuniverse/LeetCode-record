package DP.Package01.question322;

/**
 * 执行用时：35 ms, 在所有 Java 提交中击败了9.86%的用户
 * 内存消耗：41.4 MB, 在所有 Java 提交中击败了5.49%的用户
 */
class Solution {
    public int coinChange(int[] coins, int amount) {
        double[] dp = new double[amount + 1];
        //初始化dp数组
        //值的初始化很有讲究 在背包九讲中有讲解说如果要求恰好装满背包 则在初始化时要除了第一个为0 其他都设置为负无穷 这里也参考了这样的思想(设置为正无穷)
        //但显然 官方给出的题解更加的巧妙 除了第一个设置为0 其他设置为amount+1 时间能快上一些
        for(int i = 1; i < dp.length; i++){
            dp[i] = 1.0 / 0;
        }

        for(int i = 1; i < coins.length + 1; i++){
            for(int j = 0; j < dp.length; j++){
                if(coins[i - 1] <= j){
                    dp[j] = Math.min(dp[j], dp[j - coins[i - 1]] + 1);
                }
            }
        }

        if(dp[dp.length - 1] == 1.0 / 0){
            return -1;
        }else{
            return (int)dp[dp.length - 1];
        }
    }
}
