package DP.Subsequence.question1143;

/**
 * 执行用时：9 ms, 在所有 Java 提交中击败了74.02%的用户
 * 内存消耗：45.2 MB, 在所有 Java 提交中击败了21.23%的用户
 */
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for(int i = 0; i < text2.length() + 1; i++){
            dp[0][i] = 0;
        }
        for(int i = 0; i < text1.length() + 1; i++){
            dp[i][0] = 0;
        }
        for(int i = 1; i < text1.length() + 1; i++){
            char c1 = text1.charAt(i - 1);
            for(int j = 1; j < text2.length() + 1; j++){
                if(c1 == text2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
