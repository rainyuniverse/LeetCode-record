package search.DFS.question695;

public class question695 {
    public static void main(String[] args){
//        int[][] grid = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
//                                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
//                                    {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
//                                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
//                                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
//                                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
//                                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
//                                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int[][] grid = new int[][]{
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                {0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1},
                {1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1}};
        Solution solution = new Solution();
//        System.out.println(solution.maxAreaOfIsland(grid));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.maxAreaOfIsland(grid));
    }
}
