package search.backtracking.question78;

import java.util.ArrayList;
import java.util.List;

/**
 * 执行用时：7 ms, 在所有 Java 提交中击败了25.25%的用户
 * 内存消耗：41.2 MB, 在所有 Java 提交中击败了38.03%的用户
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curNum = new ArrayList<>();
        backtracking(nums, 0, res, curNum);

        return res;
    }

    private void backtracking(int[] nums, int index, List<List<Integer>> res, List<Integer> curNum){
        if(index == nums.length){
            res.add(new ArrayList<>(curNum));
            return;
        }

        for(; index < nums.length; index++){
            curNum.add(nums[index]);
            backtracking(nums, index + 1, res, curNum);
            curNum.remove(curNum.size() - 1);
            if(res.contains(curNum)){
                continue;
            }
            res.add(new ArrayList<>(curNum));
        }
    }
}
