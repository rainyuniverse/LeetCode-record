package search.backtracking.question90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了98.04%的用户
 * 内存消耗：41.5 MB, 在所有 Java 提交中击败了26.40%的用户
 */
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curNum = new ArrayList<>();
        Arrays.sort(nums);
        int[] visited = new int[nums.length];
        backtracking(nums, res, curNum, 0, visited);
        return res;
    }

    private void backtracking(int[] nums, List<List<Integer>> res, List<Integer> curNum, int index, int[] visited){
        res.add(new ArrayList<>(curNum));

        for(; index < nums.length; index++){
            if(index > 0 && nums[index] == nums[index - 1] && visited[index - 1] == 0){
                continue;
            }
            curNum.add(nums[index]);
            visited[index] = 1;
            backtracking(nums, res, curNum, index + 1, visited);
            visited[index] = 0;
            curNum.remove(curNum.size() - 1);
        }
    }
}
