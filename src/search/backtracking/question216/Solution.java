package search.backtracking.question216;

import java.util.ArrayList;
import java.util.List;
//回溯法

/**
 * 执行用时：0 ms , 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.8 MB, 在所有 Java 提交中击败了39.69%的用户
 */
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curNum = new ArrayList<>();
        backtracking(k, n, 0, 0, res, curNum, 1);
        return res;
    }

    private void backtracking(int k, int n, int count, int curSum, List<List<Integer>> res, List<Integer> curNum, int index){
        if(k == count && n == curSum){
            res.add(new ArrayList<>(curNum));
            return;
        }
        if(count > k || curSum > n){
            return;
        }

        for(; index < 10; index++){
            curNum.add(index);
            count = count + 1;
            curSum = curSum + index;
            backtracking(k, n, count, curSum, res, curNum, index + 1);
            count = count - 1;
            curSum = curSum - index;
            curNum.remove(curNum.size() - 1);
        }
    }
}
