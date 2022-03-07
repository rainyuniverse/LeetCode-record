package search.backtracking.question78;

import java.util.ArrayList;
import java.util.List;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.5 MB, 在所有 Java 提交中击败了19.60%的用户
 */
class Solution1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curNum = new ArrayList<>();
        backtracking(nums, 0, res, curNum);

        return res;
    }

    private void backtracking(int[] nums, int index, List<List<Integer>> res, List<Integer> curNum){
        res.add(new ArrayList<>(curNum));
        //for循环结束后直接退出当前递归
        for(; index < nums.length; index++){
            curNum.add(nums[index]);
            backtracking(nums, index + 1, res, curNum);
            curNum.remove(curNum.size() - 1);
        }
    }
}
