package oneQuestionEveryDay.day0321;

import java.util.HashSet;
import java.util.Set;

/**
 * 执行用时：3 ms, 在所有 Java 提交中击败了48.29%的用户
 * 内存消耗：41.9 MB, 在所有 Java 提交中击败了27.62%的用户
 */
public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return backtracking(root, set, k);
    }

    public boolean backtracking(TreeNode curNode, Set<Integer> set, int k){
        if(curNode == null){
            return false;
        }
        if(set.contains(curNode.val)){
            return true;
        }else{
            set.add(k - curNode.val);
        }
        boolean flag = false;
        flag = backtracking(curNode.left, set, k) | backtracking(curNode.right, set, k);
        return flag;
    }
}
