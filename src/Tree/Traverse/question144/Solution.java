package Tree.Traverse.question144;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
// 递归

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.6 MB, 在所有 Java 提交中击败了30.24%的用户
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(TreeNode curNode, List<Integer> list){
        if(curNode == null){
            return;
        }
        list.add(curNode.val);
        dfs(curNode.left, list);
        dfs(curNode.right, list);
    }
}
