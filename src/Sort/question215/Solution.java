package Sort.question215;

/**
 * 执行用时：9 ms, 在所有 Java 提交中击败了27.31%的用户
 * 内存消耗：41.2 MB, 在所有 Java 提交中击败了70.73%的用户
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        quicksort(nums, 0, nums.length - 1, k);
        return nums[k - 1];
    }

    public void quicksort(int[] nums, int left, int right, int k){
        if(left >= right){
            return;
        }

        int x = nums[left];
        int i = left - 1;
        int j = right + 1;
        while(i < j){
            do i++; while(nums[i] > x);
            do j--; while(nums[j] < x);

            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int leftLength = j - left + 1;
        if(k <= leftLength){
            quicksort(nums, left, j, k);
        }else{
            quicksort(nums, j + 1, right, k - leftLength);
        }
    }
}
