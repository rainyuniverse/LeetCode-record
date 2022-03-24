package Tree.recursion.question572;

import Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 执行用时：3 ms, 在所有 Java 提交中击败了79.38%的用户
 * 内存消耗：41.5 MB, 在所有 Java 提交中击败了24.57%的用户
 */
//这种方法比较通配 假如一个递归判断比较复杂的话 可以使用两个递归方法
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // 一定要注意isSubtree()方法也是递归调用 所以也需要有递归出口
        if(root == null){
            return false;
        }
        return dfs(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean dfs(TreeNode root, TreeNode subRoot){
        boolean flag = false;
        if(root == null && subRoot != null){
            return false;
        }
        if(root != null && subRoot == null){
            return false;
        }
        if(root.val != subRoot.val){
            return false;
        }
        if(root == null && subRoot == null){
            return true;
        }
        flag = dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
        return flag;
    }
}
