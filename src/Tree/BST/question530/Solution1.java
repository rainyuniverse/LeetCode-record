package Tree.BST.question530;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.4 MB, 在所有 Java 提交中击败了18.25%的用户
 */
class Solution1 {
    int preVal = -1;
    int res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }

    public void dfs(TreeNode curNode){
        if(curNode == null){
            return;
        }
        dfs(curNode.left);
        if(preVal != -1){
            res = Math.min(res, Math.abs(preVal - curNode.val));
        }
        preVal = curNode.val;
        dfs(curNode.right);
    }
}
