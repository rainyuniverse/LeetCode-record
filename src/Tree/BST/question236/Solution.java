package Tree.BST.question236;

import Tree.TreeNode;
// 两层递归 比较菜
/**
 * 执行用时：1763 ms, 在所有 Java 提交中击败了5.01%的用户
 * 内存消耗：43.2 MB, 在所有 Java 提交中击败了5.84%的用户
 */
class Solution {
    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean curRes = dfs(root, p) && dfs(root, q);
        if(curRes == true){
            res = root;
        }
        if(curRes == true && root.left != null){
            lowestCommonAncestor(root.left, p, q);
        }
        if(curRes == true && root.right != null){
            lowestCommonAncestor(root.right, p, q);
        }
        return res;
    }

    /**
     *
     * @param curNode 当前节点
     * @param findNode 要寻找的节点
     * @return 是否在当前节点及以下子树中寻找到了要寻找的节点
     */
    public boolean dfs(TreeNode curNode, TreeNode findNode){
        if(curNode == null){
            return false;
        }
        if(curNode.val == findNode.val){
            return true;
        }
        return dfs(curNode.left, findNode) || dfs(curNode.right, findNode);
    }
}
