package DP.Package01.question377;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了97.70%的用户
 * 内存消耗：38.9 MB, 在所有 Java 提交中击败了14.56%的用户
 */
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 0; i < target + 1; i++){
            for(int j = 0; j < nums.length; j++){
                if(i - nums[j] < 0){
                    dp[i] = dp[i];
                }else{
                    dp[i] = dp[i - nums[j]] + dp[i];
                }
            }
        }
        return dp[target];
    }
}
