package DP.Subsequence.question718;

/**
 * 执行用时：34 ms, 在所有 Java 提交中击败了59.98%的用户
 * 内存消耗：50.5 MB, 在所有 Java 提交中击败了5.14%的用户
 */
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        //dp[i][j] ：以下标i - 1为结尾的A，和以下标j - 1为结尾的B，最长重复子数组长度为dp[i][j]，注意结尾指的是包含当前数字
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int res = 0;
        for(int i = 1; i < nums1.length + 1; i++){
            for(int j = 1; j < nums2.length + 1; j++){
                if(nums1[i - 1] == nums2[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }

        return res;
    }
}
