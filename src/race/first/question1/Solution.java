package race.first.question1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                arr[i] = 1;
            }
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(arr[j] == 1){
                    if(Math.abs(i - j) <= k){
                        res.add(i);
                        break;
                    }
                }
            }
        }
        return res;
    }
}
