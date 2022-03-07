package search.backtracking.question40;

import java.util.ArrayList;
import java.util.List;

public class question40 {
    public static void main(String[] args){
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        Solution solution = new Solution();
        List<List<Integer>> output = new ArrayList<>();
        output = solution.combinationSum2(candidates, target);
        for(List<Integer> list: output){
            System.out.println(list);
        }
    }
}
