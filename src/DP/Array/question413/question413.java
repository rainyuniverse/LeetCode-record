package DP.Array.question413;

public class question413 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6};
        Solution solution = new Solution();
//        System.out.println(solution.numberOfArithmeticSlices(nums));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.numberOfArithmeticSlices(nums));
    }
}
