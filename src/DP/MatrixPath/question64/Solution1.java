package DP.MatrixPath.question64;
//动态规划
/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了95.28%的用户
 * 内存消耗：43.8 MB, 在所有 Java 提交中击败了35.60%的用户
 */
class Solution1 {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            if(i == 0){
                dp[i][0] = grid[i][0];
                continue;
            }
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }

        for(int i = 1; i < grid[0].length; i++){
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }

        for(int i = 1; i < grid.length; i++){
            for(int j = 1; j < grid[0].length; j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}
