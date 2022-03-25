package Tree.recursion.question687;

import Tree.TreeNode;

/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了96.75%的用户
 * 内存消耗：44.7 MB, 在所有 Java 提交中击败了46.20%的用户
 */
class Solution {
    int longPath = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return longPath;
    }

    public int dfs(TreeNode curNode){
        // 递归出口
        if(curNode == null){
            return 0;
        }

        TreeNode leftNode = curNode.left;
        TreeNode rightNode = curNode.right;
        int left = dfs(leftNode);
        int right = dfs(rightNode);

        int arrowLeft = 0;
        int arrowRight = 0;

        // 寻找以当前节点curNode作为最长路径其中一个节点的路径长度
        if(leftNode != null && leftNode.val == curNode.val){
            arrowLeft = left + 1;
        }
        if(rightNode != null && rightNode.val == curNode.val){
            arrowRight = right + 1;
        }

        // 组成的路径是左边的路径长度加上右边的路径长度 对最长路径进行更新
        longPath = Math.max(longPath, arrowLeft + arrowRight);
        // 选取更长的一支路径进行返回
        return Math.max(arrowLeft, arrowRight);
    }
}
