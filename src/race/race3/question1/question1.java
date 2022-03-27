package race.race3.question1;

import java.util.List;

public class question1 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,3};
        int[] nums2 = new int[]{1,1,2,2};

        Solution solution = new Solution();
        List<List<Integer>> res = solution.findDifference(nums1, nums2);
        for(List<Integer> list: res){
            System.out.println(list);
        }
    }
}
