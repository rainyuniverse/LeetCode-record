package DP.Package01.question416;
//01背包的动态规划解法
/**
 * 执行用时：18 ms, 在所有 Java 提交中击败了86.55%的用户
 * 内存消耗：54.3 MB, 在所有 Java 提交中击败了5.02%的用户
 */
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = nums[i] + sum;
        }

        if(sum%2 == 1){
            return false;
        }

        sum = sum / 2;

        int[][] dp = new int[nums.length][sum + 1];
        //初始化dp数组
        for(int i = 0; i < sum + 1; i++){
            if(nums[0] <= i){
                dp[0][i] = nums[0];
            }
        }

        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < sum + 1; j++){
                if(j - nums[i] >= 0){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
            if(dp[i][sum] == sum){
                return true;
            }
        }

        return false;
    }
}
