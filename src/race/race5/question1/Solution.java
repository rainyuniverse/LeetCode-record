package race.race5.question1;

public class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        for(int i = 0; i < operations.length; i++){
            int x = gem[operations[i][0]];
            int y = gem[operations[i][1]];
            y = y + x / 2;
            x = x - x / 2;
            gem[operations[i][0]] = x;
            gem[operations[i][1]] = y;
        }

        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        for(int i = 0; i < gem.length; i++){
            if(gem[i] > maxCount){
                maxCount = gem[i];
            }
            if(gem[i] < minCount){
                minCount = gem[i];
            }
        }
        return maxCount - minCount;
    }
}
