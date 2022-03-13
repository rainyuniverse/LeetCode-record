package race.first.question2;

public class question2 {
    public static void main(String[] args) {
        int n = 2;
        int[][] artifacts = new int[][]{
                {0,0,1,1}
//                {0,2,0,5},
//                {0,1,1,1},
//                {3,0,3,3},
//                {4,4,4,4},
//                {2,1,2,4}
        };
        int[][] dig = new int[][]{
                {0,0},
                {0,1},
                {1,0},
//                {1,1}
//                {0,2},
//                {0,3},
//                {0,4},
//                {2,0},
//                {2,1},
//                {2,2},
//                {2,5},
//                {3,0},
//                {3,1},
//                {3,3},
//                {3,4},
//                {4,0},
//                {4,3},
//                {4,5},
//                {5,0},
//                {5,1},
//                {5,2},
//                {5,4},
//                {5,5}
        };
        Solution solution = new Solution();
        System.out.print(solution.digArtifacts(n, artifacts, dig));
    }
}
