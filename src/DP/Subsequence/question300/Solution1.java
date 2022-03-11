package DP.Subsequence.question300;

/**
 * 执行用时：55 ms, 在所有 Java 提交中击败了70.19%的用户
 * 内存消耗：41 MB, 在所有 Java 提交中击败了20.01%的用户
 */
class Solution1 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(1 + dp[j], dp[i]);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
