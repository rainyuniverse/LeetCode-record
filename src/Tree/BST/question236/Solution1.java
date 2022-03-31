package Tree.BST.question236;

import Tree.TreeNode;
// 一层递归 题解yyds
/**
 * 执行用时：6 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：42.9 MB, 在所有 Java 提交中击败了13.99%的用户
 */
class Solution1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode nodeLeft = lowestCommonAncestor(root.left, p, q);
        TreeNode nodeRight = lowestCommonAncestor(root.right, p, q);

        if(nodeLeft == null && nodeRight == null){
            return null;
        }
        if(nodeLeft == null){
            return nodeRight;
        }
        if(nodeRight == null){
            return nodeLeft;
        }
        return root;
    }
}
