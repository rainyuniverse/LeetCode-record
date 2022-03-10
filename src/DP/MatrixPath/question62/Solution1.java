package DP.MatrixPath.question62;
//组合数学
//注意数据类型

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.3 MB, 在所有 Java 提交中击败了15.41%的用户
 */

/**
 * 从左上角到右下角的过程中，我们需要移动m+n-2次，其中有m-1次向下移动，n-1次向右移动，
 * 因此路径的总数，就是等于从m+n-2次移动中选择m-1次向下移动的方案数
 */
class Solution1 {
    public int uniquePaths(int m, int n) {
        double res1 = 1;
        for(int i = 0; i < m - 1; i++){
            res1 = res1 * (n + i) / (1 + i);
        }
        return (int)res1;
    }
}
