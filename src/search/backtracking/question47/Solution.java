package search.backtracking.question47;

import java.util.*;
//回溯法
//https://leetcode-cn.com/problems/permutations-ii/solution/hui-su-suan-fa-python-dai-ma-java-dai-ma-by-liwe-2/
//上述题解写的很好
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        //实现剪枝操作需要先对数组进行排序
        Arrays.sort(nums);
        Deque<Integer> curNums = new ArrayDeque<>();
        backtracking(nums, visited, curNums, res);
        return res;
    }

    private void backtracking(int[] nums, boolean[] visited, Deque<Integer> curNums, List<List<Integer>> res){
        if(nums.length == curNums.size()){
            res.add(new ArrayList<>(curNums));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(visited[i] == true){
                continue;
            }
            //剪枝操作
            //需要注意的一点是 上一个节点因为刚刚被撤销 所以visited[i-1]为false
            /**
             * 这里将visited[i - 1] == false改为visited[i - 1] == true同样也能通过 但保留的是倒序索引
             * 意思是，假如出现重复的情况，先将重复的数字添加到排列的末尾，然后再按照倒序的顺序向前添加重复数字
             * 而visited[i - 1] == false保留的是正序索引，执行用时大大降低
             */
            if(i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == false){
                continue;
            }
            curNums.addLast(nums[i]);
            visited[i] = true;
            backtracking(nums, visited, curNums, res);
            visited[i] = false;
            curNums.removeLast();
        }
    }
}
