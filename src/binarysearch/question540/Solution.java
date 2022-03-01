package binarysearch.question540;
// 二分法复杂版
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int res = 0;

        while(left < right){
            int midLeft = 0;
            int midRight = 0;
            int mid = (left + right) / 2;
            if(mid == 0 || mid == nums.length - 1){
                res = nums[mid];
                return res;
            }
            if(nums[mid] == nums[mid - 1]){
                midLeft = mid - 1;
                midRight = mid;
            }else if(nums[mid] == nums[mid + 1]){
                midLeft = mid;
                midRight = mid + 1;
            }


            if(midLeft % 2 == 1){
                right = mid - 1;
            }else if((nums.length - 1 - midRight) % 2 == 1){
                left = mid + 1;
            }else if(midLeft % 2 == 0 && (nums.length - 1 - midRight) % 2 == 0){
                res = nums[mid];
                return res;
            }
        }
        return nums[left];
    }
}
