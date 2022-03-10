package DP.Array.question413;
//好像不太像动态规划的动态规划
/**
 * 执行用时：77 ms, 在所有 Java 提交中击败了5.13%的用户
 * 内存消耗：167.9 MB, 在所有 Java 提交中击败了5.05%的用户
 */
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length <= 2){
            return 0;
        }
        int[][] dp = new int[nums.length - 2][nums.length];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0){
                    if(j == 0 || j == 1){
                        continue;
                    }
                    if(nums[j] - nums[j - 1] == nums[j - 1] - nums[j - 2]){
                        dp[i][j] = dp[i][j - 1] + 1;
                    }else{
                        dp[i][j] = dp[i][j - 1];
                    }
                }

                if(i != 0){
                    if(j < i + 2){
                        continue;
                    }
                    if(dp[i - 1][j] - dp[i - 1][j - 1] == dp[i - 1][j - 1] - dp[i - 1][j - 2] && dp[i - 1][j] - dp[i - 1][j - 1] != 0){
                        dp[i][j] = dp[i][j - 1] + 1;
                    }else{
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
        int res = 0;
        for(int i = 0; i < dp.length; i++){
            res = res + dp[i][dp[0].length - 1];
//            for(int j = 0; j < dp[0].length; j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
        }
        return res;
    }
}
