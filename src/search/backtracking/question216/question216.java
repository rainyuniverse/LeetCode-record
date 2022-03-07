package search.backtracking.question216;

import java.util.ArrayList;
import java.util.List;

public class question216 {
    public static void main(String[] args){
        int k = 3;
        int n = 9;
        Solution solution = new Solution();
        List<List<Integer>> output = new ArrayList<>();
        output = solution.combinationSum3(k, n);
        for(List<Integer> list: output){
            System.out.println(list);
        }
    }
}
