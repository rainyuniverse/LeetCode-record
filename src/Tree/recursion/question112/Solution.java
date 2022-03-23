package Tree.recursion.question112;

import Tree.TreeNode;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.2 MB, 在所有 Java 提交中击败了39.01%的用户
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return dfs(root, 0, targetSum);
    }

    public boolean dfs(TreeNode curNode, int curSum, int targetSum){
        if(curNode == null){
            if(curSum == targetSum){
                return true;
            }else{
                return false;
            }
        }
        curSum = curSum + curNode.val;
        boolean flag = false;
        if(curNode.left == null){
            flag = dfs(curNode.right, curSum, targetSum);
        }
        if(curNode.right == null){
            flag = dfs(curNode.left, curSum, targetSum);
        }
        if(curNode.left != null && curNode.right != null){
            flag = dfs(curNode.left, curSum, targetSum) || dfs(curNode.right, curSum, targetSum);
        }
        return flag;
    }
}
//答案解法 设置的递归出口非常妙 假如当前的节点为null直接返回false
//只有当前节点是叶结点才会进行判断
class Solution1 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
