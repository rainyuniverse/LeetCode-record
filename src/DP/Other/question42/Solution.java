package DP.Other.question42;

/**
 * 执行用时：214 ms, 在所有 Java 提交中击败了9.97%的用户
 * 内存消耗：42.2 MB, 在所有 Java 提交中击败了12.64%的用户
 */
class Solution {
    public int trap(int[] height) {
        int res = 0;
        int[] newheight = new int[height.length + 1];
        for(int i = 0; i < height.length; i++){
            newheight[i] = height[i];
        }
        for(int i = 0; i < height.length; i++){
            int preNum = newheight[i];
            int pastNum = newheight[i + 1];
            int j;
            int uptendency = 0;
            int downtendency = 0;
            int tempj = 0;
            for(j = i + 1; j < height.length; j++){
                if(height[j] - height[j - 1] > 0){
                    uptendency = 1;
                }
                if(height[j] - height[j - 1] < 0){
                    downtendency = 1;
                }


                if(newheight[j] >= pastNum){
                    pastNum = height[j];
                    tempj = j;
                }
                if(newheight[j] > preNum){
                    break;
                }
            }
            if(uptendency == 0 || downtendency == 0){
                if(i == height.length - 1){
                    break;
                }
                i = tempj - 1;
                continue;
            }
            int curMax = Math.min(preNum, pastNum);
            int curSum = 0;
            for(int m = i; m <= tempj; m++){
                if(newheight[m] > curMax){
                    continue;
                }
                curSum += curMax - newheight[m];
            }
            i = tempj - 1;
            res += curSum;
        }
        return res;
    }
}
