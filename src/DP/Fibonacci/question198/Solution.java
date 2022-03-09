package DP.Fibonacci.question198;
//这一版是自己写出来的动态规划，感觉递推公式写的不太规范，还需要遍历，所以打算看看题解
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.9 MB, 在所有 Java 提交中击败了19.67%的用户
 */
class Solution {
    public int rob(int[] nums) {
        /**
         * 这个dp[i]存的是 在偷窃第i家情况下 的最大偷窃金额
         */
        int[] dp = new int[nums.length];
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            int flag = 0;
            for(int j = 0; j < i - 1; j++){
                if(dp[j] > flag){
                    flag = dp[j];
                }
            }
            dp[i] = flag + nums[i];
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
