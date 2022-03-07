package search.backtracking.question77;

import java.util.ArrayList;
import java.util.List;
//加入剪枝条件的回溯法
/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了99.99%的用户
 * 内存消耗：42.3 MB, 在所有 Java 提交中击败了39.92%的用户
 */
class Solution1 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curArr = new ArrayList<>();
        backtracking(n, curArr, k, res, 0);
        return res;
    }

    private void backtracking(int n, List<Integer> curArr, int k, List<List<Integer>> res, int index){
        if(curArr.size() == k){
            res.add(new ArrayList<>(curArr));
            return;
        }

        //排列的时候只用遍历比当前数字大的数字就可以了
        for(; index < n; index++){
            //剪枝
            if(curArr.size() + n - index < k){
                continue;
            }
            curArr.add(index + 1);
            backtracking(n, curArr, k, res, index + 1);
            curArr.remove(curArr.size() - 1);
        }
    }
}
