package Tree.BST.question108;

import Tree.TreeNode;
// 分治法
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.1 MB, 在所有 Java 提交中击败了51.58%的用户
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = divide(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode divide(int[] nums, int left, int right){
        // 递归出口
        if(left > right){
            return null;
        }
        // 当前根节点在数组中的位置
        int mid = (left + right) / 2;
        // 当前子树根节点的创建
        // 左子树的创建
        // 右子树的创建
        TreeNode curRoot = new TreeNode(nums[mid], divide(nums, left, mid - 1), divide(nums, mid + 1, right));
        return curRoot;
    }
}
