package DP.Other.question55;
// 参考题解

/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了94.64%的用户
 * 内存消耗：41.8 MB, 在所有 Java 提交中击败了43.84%的用户
 */
class Solution1 {
    public boolean canJump(int[] nums) {
        int length=0;
        for(int i = 0;i<nums.length - 1;i++){
            // 所有能达到的位置左边的位置都能够达到
            length = Math.max(nums[i]+i,length);
            if(length == i)return false;
        }
        if(length >= nums.length-1)return true;
        return false;
    }
}
