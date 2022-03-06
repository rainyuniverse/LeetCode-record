package search.backtracking.question47;

import java.util.ArrayList;
import java.util.List;

public class question47 {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,2};
        Solution solution = new Solution();
        List<List<Integer>> output = new ArrayList<>();
        output = solution.permuteUnique(nums);
        for(List<Integer> list: output){
            System.out.println(list);
        }
    }
}
