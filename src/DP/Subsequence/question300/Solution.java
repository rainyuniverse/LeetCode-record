package DP.Subsequence.question300;

/**
 * 执行用时：62 ms, 在所有 Java 提交中击败了29.39%的用户
 * 内存消耗：41 MB, 在所有 Java 提交中击败了19.13%的用户
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i = 1; i < nums.length; i++){
            int max = Integer.MIN_VALUE;
            int flag = 0;
            for(int j = i; j >= 0; j--){
                if(nums[j] < nums[i] && 1 + dp[j] > max){
                    flag = 1;
                    max = 1 + dp[j];
                }
            }
            if(flag == 1){
                dp[i] = max;
            }else{
                dp[i] = 1;
            }
        }
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(dp[i] > res){
                res = dp[i];
            }
        }
        return res;
    }
}
