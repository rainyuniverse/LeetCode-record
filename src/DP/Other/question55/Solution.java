package DP.Other.question55;

/**
 * 执行用时：4 ms, 在所有 Java 提交中击败了18.53%的用户
 * 内存消耗：41.4 MB, 在所有 Java 提交中击败了75.15%的用户
 */
class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int curMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(dp[i] == 1 && dp[Math.min(i + nums[i], nums.length - 1)] == 0){
                for(int j = curMax; j - i <= nums[i] && j < nums.length; j++){
                    dp[j] = 1;
                    if(dp[nums.length - 1] == 1){
                        return true;
                    }
                }
                curMax = Math.min(i + nums[i], nums.length - 1);
            }
        }
        if(dp[nums.length - 1] == 1){
            return true;
        }
        return false;
    }
}
