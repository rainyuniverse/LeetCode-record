package search.DFS.question200;

public class question200 {
    public static void main(String[] args){
//        char[][] grid = new char[][]{
//                {'1', '1', '0', '0', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '1', '0', '0'},
//                {'0', '0', '0', '1', '1'}};
        char[][] grid = new char[][]{{'0'}};
        Solution solution = new Solution();
//        System.out.println(solution.numIslands(grid));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.numIslands(grid));
    }
}
