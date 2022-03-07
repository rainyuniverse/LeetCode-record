package search.backtracking.question78;

import java.util.ArrayList;
import java.util.List;

public class question78 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> output = new ArrayList<>();
        Solution solution = new Solution();
//        output = solution.subsets(nums);

        Solution1 solution1 = new Solution1();
        output = solution1.subsets(nums);
        for(List<Integer> list: output){
            System.out.println(list);
        }
    }
}
