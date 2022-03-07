package search.backtracking.question77;

import java.util.ArrayList;
import java.util.List;
//回溯法 第一次提交就成功了！！
/**
执行用时：18 ms, 在所有 Java 提交中击败了23.53%的用户
内存消耗：42.2 MB, 在所有 Java 提交中击败了42.93%的用户
 **/
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int[] numArr = new int[n];
        for(int i = 0; i < n; i++){
            numArr[i] = i + 1;
        }
        List<Integer> curArr = new ArrayList<>();
        backtracking(numArr, curArr, k, res, 0);
        return res;
    }

    private void backtracking(int[] numArr, List<Integer> curArr, int k, List<List<Integer>> res, int index){
        if(curArr.size() == k){
            res.add(new ArrayList<>(curArr));
            return;
        }

        //排列的时候只用遍历比当前数字大的数字就可以了
        for(; index < numArr.length; index++){
            curArr.add(numArr[index]);
            backtracking(numArr, curArr, k, res, index + 1);
            curArr.remove(curArr.size() - 1);
        }
    }
}
