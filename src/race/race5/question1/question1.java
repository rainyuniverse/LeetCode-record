package race.race5.question1;

public class question1 {
    public static void main(String[] args) {
        int[] gem = new int[]{100,0,50,100};
        int[][] operations = new int[][]{
                {0,2},{0,1},{3,0},{3,0}
        };
        Solution solution = new Solution();
        System.out.println(solution.giveGem(gem, operations));
    }
}
