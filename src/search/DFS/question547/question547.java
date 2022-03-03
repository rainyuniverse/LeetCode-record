package search.DFS.question547;

public class question547 {
    public static void main(String[] args){
        int[][] isConnected = new int[][]{
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1}
        };
//        int[][] isConnected = new int[][]{
//                {1,0,0},
//                {0,1,0},
//                {0,0,1}
//        };
        Solution solution = new Solution();
//        System.out.println(solution.findCircleNum(isConnected));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.findCircleNum(isConnected));
    }
}
