package Tree.recursion.question404;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了14.77%的用户
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        res += dfs(root.left, 1);
        res += dfs(root.right, 0);
        return res;
    }

    /**
     *
     * @param curNode 当前节点
     * @param flag flag == 0 右节点 || flag == 1 左节点
     * @return
     */
    public int dfs(TreeNode curNode, int flag){
        int res = 0;
        if(curNode == null){
            return 0;
        }
        // 左叶子节点
        if(curNode.left == null && curNode.right == null && flag == 1){
            res = res + curNode.val;
            return res;
        }
        // 右叶子节点
        if(curNode.left == null && curNode.right == null && flag == 0){
            return 0;
        }
        res = res + dfs(curNode.left, 1);
        res = res + dfs(curNode.right, 0);
        return res;
    }
}
