package race.race4.question3;

class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for(int i = 0; i < candies.length; i++){
            sum = sum + candies[i];
        }
        if(sum < k){
            return 0;
        }

        long upPer = sum / k;
        long min = 1;
        long max = upPer;
        long mid = (min + max) / 2;
        int res = 0;
        for(long i = mid; min <= max;){
            long count = 0;
            for(int j = 0; j < candies.length; j++){
                count = count + candies[j] / i;
            }
            if(count >= k){
                res = Math.max(res, (int)i);
                min = mid + 1;
            }
            if(count < k){
                max = mid - 1;
            }
            mid = (min + max) / 2;
            i = mid;
        }
        return res;
    }
}
