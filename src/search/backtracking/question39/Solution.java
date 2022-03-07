package search.backtracking.question39;

import java.util.ArrayList;
import java.util.List;
//回溯法第一版 正向考虑

/**
 * 执行用时：3 ms , 在所有 Java 提交中击败了55.23%的用户
 * 内存消耗：41.9 MB, 在所有 Java 提交中击败了11.54%的用户
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curNum = new ArrayList<>();
        backtracking(candidates, target, res, curNum, 0, 0);
        return res;
    }

    private void backtracking(int[] candidates, int target, List<List<Integer>> res, List<Integer> curNum, int curSum, int index){
        if(curSum == target){
            res.add(new ArrayList<>(curNum));
            return;
        }
        if(curSum > target){
            return;
        }
        //在每次遍历的时候只遍历大于等于当前数字 防止重复
        for(; index < candidates.length; index++){
            curNum.add(candidates[index]);
            curSum = curSum + candidates[index];
            backtracking(candidates, target, res, curNum, curSum, index);
            curSum = curSum - candidates[index];
            curNum.remove(curNum.size() - 1);
        }
    }
}
