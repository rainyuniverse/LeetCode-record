package search.backtracking.question46;

import java.util.ArrayList;
import java.util.List;
//回溯法
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
            //要先进行拷贝再放进去 否则的话地址中存储的内容不断变化 最终存进res值也会发生变化
            return;
        }
        //for循环在某种程度上也能防止重复遍历 和visited访问矩阵起到一样的效果
        //比如[1,2,3]在回退到[1]之后 此时i对应的值为2 下一个遍历的数字是3 即下一种情况为[1,3,2]
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
