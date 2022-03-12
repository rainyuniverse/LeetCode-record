package DP.Subsequence.question376;

/**
 * 执行用时：4 ms, 在所有 Java 提交中击败了11.40%的用户
 * 内存消耗：39.1 MB, 在所有 Java 提交中击败了11.07%的用户
 */
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int[] dp = new int[nums.length];
        int[] arr = new int[nums.length];
        if(nums.length == 1){
            return 1;
        }
        dp[0] = 1;
        for(int i = 1; i < nums.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if((nums[i] < nums[j] && arr[j] == 1) || (nums[i] < nums[j] && arr[j] == 0)){
                    if(dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        arr[i] = -1;
                    }
                }
                if((nums[i] > nums[j] && arr[j] == -1) || (nums[i] > nums[j] && arr[j] == 0)){
                    if(dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        arr[i] = 1;
                    }
                }
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
