package DP.Array.question413;
//比较标准的动态规划

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了14.00%的用户
 */
class Solution1 {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length <= 2){
            return 0;
        }
        //dp[i]记录以i为终点的等差数列的个数
        int[] dp = new int[nums.length];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]){
                dp[i] = dp[i - 1] + 1;
            }else{
                dp[i] = 0;
            }
        }
        int res = 0;
        for(int i = 2; i < nums.length; i++){
            res = res + dp[i];
        }
        return res;
    }
}
