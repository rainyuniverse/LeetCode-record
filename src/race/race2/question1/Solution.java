package race.race2.question1;

class Solution {
    public int countHillValley(int[] nums) {
        int res = 0;
        for(int i = 1; i < nums.length - 1; i++){
            int beginIndex = i;
            int endIndex = i;
            for(int j = beginIndex; j < nums.length - 1; j++){
                endIndex = j;
                if(nums[endIndex] == nums[beginIndex]){
                    endIndex++;
                }else{
                    break;
                }
            }

            endIndex--;

            if((nums[beginIndex] > nums[beginIndex - 1] && nums[endIndex] > nums[endIndex + 1]) || (nums[beginIndex] < nums[beginIndex - 1] && nums[endIndex] < nums[endIndex + 1])){
                res++;
            }
            i = endIndex;
        }
        return res;
    }
}
