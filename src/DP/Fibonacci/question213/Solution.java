package DP.Fibonacci.question213;
//分两种情况考虑的动态规划 注意“可以”
//或者说，在两个区间上分别使用动态规划 [0,n-2] [1,n-1]
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.7 MB, 在所有 Java 提交中击败了35.47%的用户
 */
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        //可以抢第一个但不能抢最后一个
        //与必须抢第一个作区分
        dp[0] = nums[0];
        dp[1] = nums[0];
        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        int firstRes = dp[nums.length - 2];
        //可以抢最后一个但不能抢第一个
        //与必须抢最后一个作区分
        dp[0] = 0;
        dp[1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        int secondRes = dp[nums.length - 1];
        return Math.max(firstRes, secondRes);
    }
}
