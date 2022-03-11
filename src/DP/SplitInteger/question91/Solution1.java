package DP.SplitInteger.question91;
/**
 * 分两种情况：
 * 1.使用一个字符s[i]进行解码，只要s[i]!=0，那么dp[i]=dp[i-1]
 * 2.使用两个字符s[i-1]和s[i]进行解码，s[i-1]!=0，且组成的数字小于等于26，那么dp[i]=dp[i-2]
 */

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了38.86%的用户
 */
class Solution1 {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for(int i = 1; i <=s.length(); i++){
            //第一种情况
            int res1 = 0;
            if(s.charAt(i - 1) != '0'){
                res1 = dp[i - 1];
            }
            //第二种情况
            int res2 = 0;
            //((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26操作较快
            if(i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)){
                res2 = dp[i - 2];
            }
            dp[i] = res1 + res2;
        }
        return dp[s.length()];
    }
}
