package race.race3.question2;

class Solution {
    public int minDeletion(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if((i - res) % 2 == 0 && nums[i] == nums[i + 1]){
                res++;
            }
        }
        if((nums.length - res) % 2 != 0){
            res++;
        }
        return res;
    }
}
