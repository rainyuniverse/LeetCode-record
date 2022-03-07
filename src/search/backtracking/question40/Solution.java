package search.backtracking.question40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//回溯+剪枝
/**
 * 执行用时：2 ms , 在所有 Java 提交中击败了98.09%的用户
 * 内存消耗：41.9 MB, 在所有 Java 提交中击败了7.09%的用户
 */
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> curNum = new ArrayList<>();
        int[] visited = new int[candidates.length];
        backtracking(candidates, target, res, curNum, 0, visited);
        return res;
    }

    private void backtracking(int[] candidates, int target, List<List<Integer>> res, List<Integer> curNum, int index, int[] visited){
        if(target == 0){
            res.add(new ArrayList<>(curNum));
            return;
        }
        if(target < 0){
            return;
        }

        for(; index < candidates.length; index++){
            //保证不能重复使用每一个数字
            //visited[index - 1] == 0的用法详见question47
            if(index > 0 && candidates[index] == candidates[index - 1] && visited[index - 1] == 0){
                continue;
            }
            //剪枝
            if(target - candidates[index] < 0){
                break;
            }
            curNum.add(candidates[index]);
            visited[index] = 1;
            backtracking(candidates, target - candidates[index], res, curNum, index + 1, visited);
            curNum.remove(curNum.size() - 1);
            visited[index] = 0;
        }
    }
}
