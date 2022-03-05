package search.backtracking.question17;

import java.util.ArrayList;
import java.util.List;
//回溯法
class Solution1 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0){
            return res;
        }
        char[] digitArrChar = digits.toCharArray();
        int[] digitArr = new int[digitArrChar.length];
        for(int i = 0; i < digitArrChar.length; i++){
            digitArr[i] = digitArrChar[i] - '0';
        }
        String[] arr = new String[]{
                "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        String curStr = "";
        backtracking(digitArr, 0, arr, res, curStr);
        return res;
    }

    private void backtracking(int[] digitArr, int index, String[] arr, List<String> res, String curStr){
        if(index == digitArr.length){
            res.add(curStr);
            return;
        }
        char[] curArr = arr[digitArr[index] - 2].toCharArray();
        for(int i = 0; i < curArr.length; i++){
            curStr = curStr + String.valueOf(curArr[i]);
            backtracking(digitArr, index + 1, arr, res, curStr);
            curStr = curStr.substring(0, curStr.length() - 1);
        }
    }
}
