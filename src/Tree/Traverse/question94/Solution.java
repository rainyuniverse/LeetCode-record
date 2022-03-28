package Tree.Traverse.question94;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.3 MB, 在所有 Java 提交中击败了62.01%的用户
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        dfs(root, res);
        return res;
    }

    public void dfs(TreeNode curNode, List<Integer> res){
        if(curNode == null){
            return;
        }
        dfs(curNode.left, res);
        res.add(curNode.val);
        dfs(curNode.right, res);
    }
}
