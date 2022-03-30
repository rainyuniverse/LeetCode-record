package Tree.BST.question235;

import Tree.TreeNode;

/**
 * 执行用时：5 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：42.3 MB, 在所有 Java 提交中击败了30.96%的用户
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val >= Math.min(p.val, q.val) && root.val <= Math.max(p.val, q.val)){
            return root;
        }
        if(root.val > Math.max(p.val, q.val)){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(root.val < Math.min(p.val, q.val)){
            return lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }
}
