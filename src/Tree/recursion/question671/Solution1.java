package Tree.recursion.question671;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.7 MB, 在所有 Java 提交中击败了32.38%的用户
 */
class Solution1 {
    int flag = 0;
    public int findSecondMinimumValue(TreeNode root) {
        int res = dfs(root, root.val);
        if(flag == 0){
            return -1;
        }
        return res;
    }

    public int dfs(TreeNode curNode, int val){
        if(curNode == null){
            return Integer.MAX_VALUE;
        }
        if(curNode.val > val){
            flag = 1;
            return curNode.val;
        }
        int res = Math.min(dfs(curNode.left, val), dfs(curNode.right, val));
        return res;
    }
}
