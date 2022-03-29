package Tree.BST.question669;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：40.8 MB, 在所有 Java 提交中击败了58.91%的用户
 */
class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null){
            return root;
        }
        if(root.val < low){
            // 如果当前节点值小于最小值 则剪去左子树 进入右子树继续进行判断
            return trimBST(root.right, low, high);
        }
        if(root.val > high){
            // 如果当前节点值大于最大值 则剪去右子树 进入左子树继续进行判断
            return trimBST(root.left, low, high);
        }
        // 如果当前节点值在区间内 则进入左右子树进行判断
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
