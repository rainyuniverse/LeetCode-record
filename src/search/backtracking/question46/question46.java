package search.backtracking.question46;

import java.util.List;

public class question46 {
    public static void main(String[] args){
        int[] nums = new int[]{1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> output = solution.permute(nums);
        for(List<Integer> list: output){
//            for(Integer i: list){
//                System.out.print(i + " ");
//            }
            System.out.println(list);
        }
    }
}
