package Tree.recursion.question104;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：40.9 MB, 在所有 Java 提交中击败了55.43%的用户
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode curNode, int depth){
        if(curNode == null){
            return depth;
        }
        depth = depth + 1;
        depth = Math.max(dfs(curNode.left, depth), dfs(curNode.right, depth));
        return depth;
    }
}
