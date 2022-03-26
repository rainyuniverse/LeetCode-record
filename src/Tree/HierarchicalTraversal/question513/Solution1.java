package Tree.HierarchicalTraversal.question513;

import Tree.TreeNode;
// 递归
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：40.8 MB, 在所有 Java 提交中击败了54.33%的用户
 */
public class Solution1 {
    int res = 0;
    int maxDepth = -1;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    public void dfs(TreeNode curNode, int depth){
        if(curNode == null){
            return;
        }
        // 当前节点是叶节点
        // 相同深度肯定是最左边的节点先被记上
        if(curNode.left == null && curNode.right == null){
            if(depth > maxDepth){
                maxDepth = depth;
                res = curNode.val;
            }
        }
        dfs(curNode.left, depth + 1);
        dfs(curNode.right, depth + 1);
    }
}
