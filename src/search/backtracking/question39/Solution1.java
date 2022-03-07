package search.backtracking.question39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//回溯法第二版 反向考虑+剪枝
/**
 * 执行用时：2 ms , 在所有 Java 提交中击败了96.57%的用户
 * 内存消耗：41.6 MB, 在所有 Java 提交中击败了28.63%的用户
 */
class Solution1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //排序是剪枝的前提
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curNum = new ArrayList<>();
        backtracking(candidates, target, res, curNum, 0);
        return res;
    }

    private void backtracking(int[] candidates, int target, List<List<Integer>> res, List<Integer> curNum, int index){
        if(target == 0){
            res.add(new ArrayList<>(curNum));
            return;
        }
        if(target < 0){
            return;
        }

        for(; index < candidates.length; index++){
            //因为数组是按照从小到大的顺序进行排序的数组，所以如果当前数字不能够满足要求，那么后面的数字更不能满足要求，可以利用这一点进行剪枝
            if(target - candidates[index] < 0){
                break;
            }
            curNum.add(candidates[index]);
            backtracking(candidates, target - candidates[index], res, curNum, index);
            curNum.remove(curNum.size() - 1);
        }
    }
}
