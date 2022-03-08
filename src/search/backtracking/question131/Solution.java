package search.backtracking.question131;

import java.util.ArrayList;
import java.util.List;
//回溯法
/**
 * 执行用时：6 ms, 在所有 Java 提交中击败了99.52%的用户
 * 内存消耗：53.2 MB, 在所有 Java 提交中击败了47.86%的用户
 */
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        List<String> curList = new ArrayList<>();
        backtracking(s, arr, 0, 0, res, curList);
        return res;
    }

    private void backtracking(String s, char[] arr, int beginIndex, int endIndex, List<List<String>> res, List<String> curList){
        if(endIndex == arr.length){
            res.add(new ArrayList<>(curList));
            return;
        }
        if(endIndex >= arr.length){
            return;
        }

        for(int i = beginIndex; i < arr.length; i++){
            endIndex = i;
            int flag = 1;
            for(int j = 0; j <= (endIndex - beginIndex)/2; j++){
                if(arr[beginIndex + j] != arr[endIndex - j]){
                    flag = 0;
                }
            }

            if(flag == 1){
                curList.add(s.substring(beginIndex, endIndex + 1));
                backtracking(s, arr, i + 1, i + 1, res, curList);
                curList.remove(curList.size() - 1);
            }
        }
    }
}
