package search.backtracking.question46;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        List<Integer> curNums = new ArrayList<>();
        backtracking(nums, visited, res, curNums);
        return res;
    }
    private void backtracking(int[] nums, int[] visited, List<List<Integer>> res, List<Integer> curNums){
        if(curNums.size() == nums.length){
            res.add(new ArrayList<Integer>(curNums));
            //res.add(curNums)这种写法不对？
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i] == 1){
                continue;
            }
            curNums.add(nums[i]);
            visited[i] = 1;
            backtracking(nums, visited, res, curNums);
            visited[i] = 0;
            curNums.remove(curNums.size() - 1);
        }
    }
}
