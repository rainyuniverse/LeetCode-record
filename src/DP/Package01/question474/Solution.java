package DP.Package01.question474;
//自己写的动态规划 执行时间比较拉

/**
 * 执行用时：59 ms, 在所有 Java 提交中击败了15.10%的用户
 * 内存消耗：67.9 MB, 在所有 Java 提交中击败了5.56%的用户
 */
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[] arr0 = new int[strs.length];
        int[] arr1 = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            char[] str = strs[i].toCharArray();
            int sum0 = 0;
            int sum1 = 0;
            for(int j = 0; j < str.length; j++){
                if(str[j] == '0'){
                    sum0++;
                }else if(str[j] == '1'){
                    sum1++;
                }
            }
            arr0[i] = sum0;
            arr1[i] = sum1;
        }

        int[][][] dp = new int[strs.length + 1][m + 1][n + 1];

        for(int z = 1; z < strs.length + 1; z++){
            for(int i = 0; i < m + 1; i++){
                for(int j = 0; j < n + 1; j++){
                    if(arr0[z - 1] > i || arr1[z - 1] > j){
                        dp[z][i][j] = dp[z - 1][i][j];
                    }else if(arr0[z - 1] <= i && arr1[z - 1] <= j){
                        dp[z][i][j] = Math.max(dp[z - 1][i][j], dp[z - 1][i - arr0[z - 1]][j - arr1[z - 1]] + 1);
                    }
                }
            }
        }


        return dp[strs.length][m][n];
    }
}
