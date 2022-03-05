package search.backtracking.question93;

import java.util.List;

public class question93 {
    public static void main(String[] args){
        String input = "25525511135";
        Solution solution = new Solution();
        List<String> output = solution.restoreIpAddresses(input);
        for(String s : output){
            System.out.println(s);
        }
    }
}
