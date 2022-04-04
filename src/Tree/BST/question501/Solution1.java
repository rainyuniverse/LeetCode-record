package Tree.BST.question501;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 中序遍历二叉搜索树等于遍历有序数组
/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：41.8 MB, 在所有 Java 提交中击败了42.69%的用户
 */
class Solution1 {
    int preVal = -1;
    int curSum = 0;
    int maxCount = 0;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public void dfs(TreeNode curNode){
        if(curNode == null){
            return;
        }
        dfs(curNode.left);
        if(preVal == -1){
            preVal = curNode.val;
        }
        if(curNode.val == preVal){
            curSum++;
        }else{
            curSum = 1;
        }
        if(curSum > maxCount){
            list.clear();
            list.add(curNode.val);
            maxCount = curSum;
        }else if(curSum == maxCount){
            list.add(curNode.val);
        }
        preVal = curNode.val;
        dfs(curNode.right);
    }
}
