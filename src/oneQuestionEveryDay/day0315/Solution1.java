package oneQuestionEveryDay.day0315;

import java.util.ArrayList;
import java.util.List;

/**
 * 执行用时：5 ms, 在所有 Java 提交中击败了72.02%的用户
 * 内存消耗：38.8 MB, 在所有 Java 提交中击败了39.92%的用户
 */
class Solution1 {
    int count = 0;
    int maxRes = 0;
    public int countMaxOrSubsets(int[] nums) {
        backtracking(0, nums, 0);
        return count;
    }

    public void backtracking(int index, int[] nums, int curRes){
        for(int i = index; i < nums.length; i++){
            int tempRes = curRes;
            curRes = curRes | nums[i];
            if(curRes > maxRes){
                maxRes = curRes;
                count = 1;
            }else if(curRes == maxRes){
                count++;
            }
            backtracking(i + 1, nums, curRes);
            curRes = tempRes;
        }
    }
}
