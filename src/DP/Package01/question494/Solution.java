package DP.Package01.question494;
//问题转化成在数组 nums 中选取若干元素，使得这些元素之和等于 neg，计算选取元素的方案数。
//当求方案数时可以考虑这种解法
//一开始的时候在dp数组中存储选取当前背包包含物品重量（当前选取数字的和） 发现不太行 还是应该存方案数
/**
 * 执行用时：3 ms, 在所有 Java 提交中击败了71.23%的用户
 * 内存消耗：40.7 MB, 在所有 Java 提交中击败了17.49%的用户
 */
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        if((sum - target) % 2 == 1 || (sum - target) < 0){
            return 0;
        }
        int weightSum = (sum - target) / 2;
        int[][] dp = new int[nums.length + 1][weightSum + 1];
        //dp[i][j]表示在数组nums的前i个数中选取元素，使得这些元素之和等于j的方案数
        //dp数组初始化要思考清楚
        //当要满足的和为0时，没有提供元素时，有一种情况
        //当要满足的和大于0时，没有提供元素时，有0种情况
        for(int i = 0; i < weightSum + 1; i++){
            if(i == 0){
                dp[0][i] = 1;
            }else{
                dp[0][i] = 0;
            }
        }
        //分两种情况。使用当前元素和不使用当前元素
        //若要满足的和小于当前元素时，不能使用当前元素，因此方案数等于使用前i-1个元素满足 要求和 的方案数
        //若要满足的和大于当前元素时，可以不使用当前元素，这一部分的方案数等于使用前i-1个元素满足 要求和 的方案数
        //                      也可以使用当前元素，这一部分的方案数等于使用前i-1个元素满足 要求和-当前元素值 的方案数
        for(int i = 1; i < nums.length + 1; i++){
            for(int j = 0; j < weightSum + 1; j++){
                if(j < nums[i - 1]){
                    dp[i][j] = dp[i - 1][j];
                }else{
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[nums.length][weightSum];
    }
}
