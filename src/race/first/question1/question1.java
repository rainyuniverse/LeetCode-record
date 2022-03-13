package race.first.question1;

import java.util.ArrayList;
import java.util.List;

public class question1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,2,2,2};
        int key = 2;
        int k = 2;
        Solution solution = new Solution();
        List<Integer> output = new ArrayList<>();
        output = solution.findKDistantIndices(nums,key,k);
        for(Integer i : output){
            System.out.print(i+" ");
        }
    }
}
