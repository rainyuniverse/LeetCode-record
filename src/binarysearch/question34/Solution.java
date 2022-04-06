package binarysearch.question34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length == 0){
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        if(nums[left] != target){
            res[0] = -1;
        }else{
            res[0] = left;
        }

        left = 0;
        right = nums.length - 1;
        while(left < right){
            int mid = (left + right + 1) / 2;
            if(nums[mid] <= target){
                left = mid;
            }else{
                right = mid - 1;
            }
        }

        if(nums[left] != target){
            res[1] = -1;
        }else{
            res[1] = left;
        }
        return res;
    }
}
