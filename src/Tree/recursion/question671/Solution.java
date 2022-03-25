package Tree.recursion.question671;

import Tree.TreeNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了6.78%的用户
 * 内存消耗：39.2 MB, 在所有 Java 提交中击败了5.05%的用户
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        dfs(root, set);
        int[] array = new int[set.size()];
        int count = 0;
        for(Integer i : set){
            array[count] = i;
            count++;
        }
        Arrays.sort(array);
        if(array.length == 1){
            return -1;
        }else{
            return array[1];
        }
    }

    public void dfs(TreeNode curNode, Set<Integer> set){
        if(curNode == null){
            return;
        }
        set.add(curNode.val);
        dfs(curNode.left, set);
        dfs(curNode.right, set);
    }
}
