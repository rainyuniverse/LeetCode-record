package race.race5.question2;

public class question2 {
    public static void main(String[] args) {
        int[] materials = new int[]{3,2,4,1,2};
        int[][] cookbooks = new int[][]{
                {1, 1, 0, 1, 2}, {2, 1, 4, 0, 0}, {3, 2, 4, 1, 0}
        };
        int[][] attribute = new int[][]{
                {3, 2}, {2, 4}, {7, 6}
        };
        int limit = 5;
        Solution solution = new Solution();
        System.out.println(solution.perfectMenu(materials, cookbooks, attribute, limit));
    }
}
