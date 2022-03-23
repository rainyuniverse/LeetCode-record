package Tree.recursion.question617;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.6 MB, 在所有 Java 提交中击败了8.55%的用户
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        root1 = dfs(root1, root2);
        return root1;
    }

    /**
     * 两个二叉树的对应节点可能存在以下三种情况，对于每种情况使用不同的合并方式。
     * 如果两个二叉树的对应节点都为空，则合并后的二叉树的对应节点也为空；
     * 如果两个二叉树的对应节点只有一个为空，则合并后的二叉树的对应节点为其中的非空节点；
     * 如果两个二叉树的对应节点都不为空，则合并后的二叉树的对应节点的值为两个二叉树的对应节点的值之和，此时需要显性合并两个节点。
     * @param curNode1
     * @param curNode2
     * @return
     */
    public TreeNode dfs(TreeNode curNode1, TreeNode curNode2){
        if(curNode1 == null){
            return curNode2;
        }
        if(curNode2 == null){
            return curNode1;
        }
        curNode1.val = curNode1.val + curNode2.val;
        curNode1.left = dfs(curNode1.left, curNode2.left);
        curNode1.right = dfs(curNode1.right, curNode2.right);
        return curNode1;
    }
}
