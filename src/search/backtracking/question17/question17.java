package search.backtracking.question17;

import java.util.List;

public class question17 {
    public static void main(String[] args){
        String input = "27";
        Solution solution = new Solution();
        List<String> output = solution.letterCombinations(input);
        for(String s : output){
            System.out.println(s);
        }
    }
}
