package Tree.recursion.question111;

import Tree.TreeNode;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了93.81%的用户
 * 内存消耗：60.5 MB, 在所有 Java 提交中击败了50.78%的用户
 */
class Solution {
    int minDepth = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root, 0);
        return minDepth;
    }

    public void dfs(TreeNode curNode, int depth){
        if(curNode == null){
            return;
        }
        depth = depth + 1;
        // 剪枝
        if(depth > minDepth){
            return;
        }
        if(curNode.left == null &&curNode.right == null){
            if(depth < minDepth){
                minDepth = depth;
            }
        }
        dfs(curNode.left, depth);
        dfs(curNode.right, depth);
    }
}
