package DP.Subsequence.question300;

public class question300 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
        Solution solution = new Solution();
//        System.out.println(solution.lengthOfLIS(nums));
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.lengthOfLIS(nums));
    }
}
