package DP.Fibonacci.question198;
//标准版动态规划
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39 MB, 在所有 Java 提交中击败了12.11%的用户
 */
class Solution1 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}
