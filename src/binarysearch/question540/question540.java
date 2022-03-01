package binarysearch.question540;
//你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。
public class question540 {
    public static void main(String[] arrgs){
        int[] arr = new int[]{1,2,2,3,3};
        Solution solution = new Solution();
//        System.out.println(solution.singleNonDuplicate(arr));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.singleNonDuplicate(arr));
    }
}
