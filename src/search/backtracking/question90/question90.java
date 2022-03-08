package search.backtracking.question90;

import java.util.ArrayList;
import java.util.List;

public class question90 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,2};
        List<List<Integer>> output = new ArrayList<>();
        Solution solution = new Solution();
        output = solution.subsetsWithDup(nums);
        for(List<Integer> list: output){
            System.out.println(list);
        }
    }
}
