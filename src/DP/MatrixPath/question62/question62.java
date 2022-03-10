package DP.MatrixPath.question62;

public class question62 {
    public static void main(String[] args){
        int m = 4;
        int n = 6;
        Solution solution = new Solution();
//        System.out.println(solution.uniquePaths(m, n));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.uniquePaths(m, n));
    }
}
