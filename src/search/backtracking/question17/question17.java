package search.backtracking.question17;

import java.util.List;

public class question17 {
    public static void main(String[] args){
        String input = "";
        Solution solution = new Solution();
//        List<String> output = solution.letterCombinations(input);
        Solution1 solution1 = new Solution1();
        List<String> output = solution1.letterCombinations(input);
        for(String s : output){
            System.out.println(s);
        }
    }
}
