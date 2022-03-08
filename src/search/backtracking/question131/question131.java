package search.backtracking.question131;

import java.util.ArrayList;
import java.util.List;

public class question131 {
    public static void main(String[] args){
        String s = "a";
        List<List<String>> output = new ArrayList<>();
        Solution solution = new Solution();
        output = solution.partition(s);
        for(List<String> list: output){
            System.out.println(list);
        }
    }
}
