package DP.Subsequence.question646;

public class question646 {
    public static void main(String[] args) {
        int[][] pairs = new int[][]{
                {1,3},
                {2,3},
                {7,8},
                {4,5}
        };
        Solution solution = new Solution();
        System.out.println(solution.findLongestChain(pairs));
    }
}
