package DP.Package01.question139;

import java.util.List;
//写了好久的动态规划还是不会写 太菜了 又是参考题解写出来的
//https://leetcode-cn.com/problems/word-break/solution/dong-tai-gui-hua-ji-yi-hua-hui-su-zhu-xing-jie-shi/

/**
 * 执行用时：8 ms, 在所有 Java 提交中击败了33.77%的用户
 * 内存消耗：41.7 MB, 在所有 Java 提交中击败了10.58%的用户
 */

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        int[] dp = new int[length + 1];
        dp[0] = 1;
        //i为单词的开始索引
        for(int i = 0; i < length + 1; i++){
            //j为单词的结束索引
            for(int j = i + 1; j < length + 1; j++){
                //这里只要包含就可以 不用再遍历list中的字符串
                //dp[i] = 1表示s的前i位可以被wordDict表示
                if(dp[i] == 1 && wordDict.contains(s.substring(i, j))){
                    dp[j] = 1;
                }
            }
        }

        if(dp[length] == 1){
            return true;
        }else{
            return false;
        }
    }
}
