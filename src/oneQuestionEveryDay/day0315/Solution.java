package oneQuestionEveryDay.day0315;

import java.util.ArrayList;
import java.util.List;
//先寻找子集
/**
 * 执行用时：256 ms, 在所有 Java 提交中击败了5.35%的用户
 * 内存消耗：55.6 MB, 在所有 Java 提交中击败了5.35%的用户
 */
class Solution {
    public int countMaxOrSubsets(int[] nums) {
        List<List<Integer>> sumList = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        backtracking(0, nums, curList, sumList);
        int max = Integer.MIN_VALUE;
        for(List<Integer> list : sumList){
            int curRes = 0;
            for(Integer i: list){
                curRes = curRes | i;
            }
            if(curRes > max){
                max = curRes;
            }
        }

        int count = 0;
        for(List<Integer> list : sumList){
            int curRes = 0;
            for(Integer i: list){
                curRes = curRes | i;
            }
            if(curRes == max){
                count++;
            }
        }
        return count;
    }

    public void backtracking(int index, int[] nums, List<Integer> curList, List<List<Integer>> sumList){
        for(int i = index; i < nums.length; i++){
            curList.add(nums[i]);
            sumList.add(new ArrayList<>(curList));
            backtracking(i + 1, nums, curList, sumList);
            curList.remove(curList.size() - 1);
        }
    }
}
