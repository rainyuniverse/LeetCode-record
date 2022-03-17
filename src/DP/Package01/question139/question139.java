package DP.Package01.question139;

import java.util.ArrayList;
import java.util.List;

public class question139 {
    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        Solution solution = new Solution();
        System.out.println(solution.wordBreak(s, wordDict));
    }
}
