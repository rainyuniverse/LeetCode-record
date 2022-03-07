package search.backtracking.question39;

import java.util.ArrayList;
import java.util.List;

public class question39 {
    public static void main(String[] args){
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        Solution solution = new Solution();
        List<List<Integer>> output = new ArrayList<>();
//        output = solution.combinationSum(candidates, target);

        Solution1 solution1 = new Solution1();
        output = solution1.combinationSum(candidates, target);
        for(List<Integer> list: output){
            System.out.println(list);
        }
    }
}
