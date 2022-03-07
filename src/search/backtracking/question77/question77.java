package search.backtracking.question77;

import java.util.ArrayList;
import java.util.List;

public class question77 {
    public static void main(String[] args){
        int n = 5;
        int k = 2;
        Solution solution = new Solution();
        List<List<Integer>> output = new ArrayList<>();
//        output = solution.combine(n, k);

        Solution1 solution1 = new Solution1();
        output = solution1.combine(n, k);
        for(List<Integer> list: output){
            System.out.println(list);
        }
    }
}
