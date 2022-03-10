package DP.MatrixPath.question64;

public class question64 {
    public static void main(String[] args){
        int[][] grid = new int[][]{
                {1,3,1},
                {1,5,1},
                {4, 2, 1}
        };
        Solution solution = new Solution();
//        System.out.println(solution.minPathSum(grid));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.minPathSum(grid));
    }
}
