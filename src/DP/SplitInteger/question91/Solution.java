package DP.SplitInteger.question91;
//菜到不行的动态规划 不知道为啥自己每次写都写好多条件
/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了7.74%的用户
 * 内存消耗：41.4 MB, 在所有 Java 提交中击败了5.01%的用户
 */
class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        char[] arr = s.toCharArray();
        if(arr[0] == '0'){
            return 0;
        }else{
            dp[0] = 1;
        }
        for(int i = 1; i < s.length(); i++){
            if(i == 1 && arr[i] == '0'){
                if(Integer.parseInt(String.valueOf(arr[i - 1]) + String.valueOf(arr[i])) > 26){
                    return 0;
                }else{
                    dp[i] = dp[i - 1];
                    continue;
                }
            }
            if(i > 1 && arr[i] == '0'){
                if(arr[i - 1] == '0'){
                    return 0;
                }
                if(Integer.parseInt(String.valueOf(arr[i - 1]) + String.valueOf(arr[i])) > 26){
                    return 0;
                }
                dp[i] = dp[i - 2];
                continue;
            }
            if(Integer.parseInt(String.valueOf(arr[i - 1]) + String.valueOf(arr[i])) > 26 || arr[i - 1] == '0'){
                dp[i] = dp[i - 1];
                continue;
            }
            if(Integer.parseInt(String.valueOf(arr[i - 1]) + String.valueOf(arr[i])) <= 26){
                if(i > 1){
                    dp[i] = dp[i - 1] + dp[i - 2];
                }else{
                    dp[i] = dp[i - 1] + 1;
                }
            }
        }
        return dp[s.length() - 1];
    }
}
