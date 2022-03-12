package DP.Subsequence.question646;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 执行用时：34 ms, 在所有 Java 提交中击败了33.41%的用户
 * 内存消耗：41.3 MB, 在所有 Java 提交中击败了35.88%的用户
 */
class Solution {
    public int findLongestChain(int[][] pairs) {
        //SORT
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        //dp[i] 存储以 pairs[i] 结尾的最长链的长度
        int[] dp = new int[pairs.length];
        dp[0] = 1;
        int res = 1;
        for(int i = 1; i < pairs.length; i++){
            int max = 1;
            for(int j = 0; j < i; j++){
                //dp[i] = max(dp[i], dp[j] + 1)
                if(pairs[j][1] < pairs[i][0] && max < dp[j] + 1){
                    max = dp[j] + 1;
                }
            }
            dp[i] = max;
            res = Math.max(max, res);
        }
        return res;
    }
}
