package search.backtracking.question17;

import java.util.ArrayList;
import java.util.List;
//DFS
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        char[] digitArrChar = digits.toCharArray();
        int[] digitArr = new int[digitArrChar.length];
        for(int i = 0; i < digitArrChar.length; i++){
            digitArr[i] = digitArrChar[i] - '0';
        }
        String[] arr = new String[]{
                "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        String str = "";
        dfs(digitArr, 0, arr, res, str);


        return res;
    }

    private void dfs(int[] digitArr, int index, String[] arr, List<String> res, String str){
        String oriStr = str;
        if(index >= digitArr.length){
            return;
        }
        String curStr = arr[digitArr[index] - 2];
        char[] curArr = curStr.toCharArray();
        for(int i = 0; i < curArr.length; i++){
            String curSingleStr = String.valueOf(curArr[i]);
            String copyStr = oriStr;
            String nextStr = copyStr + curSingleStr;
            if(index == digitArr.length - 1){
                res.add(nextStr);
            }
            dfs(digitArr, index + 1, arr, res, nextStr);
        }
    }
}
