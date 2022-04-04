package Tree.BST.question501;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 执行用时：5 ms, 在所有 Java 提交中击败了22.20%的用户
 * 内存消耗：42.9 MB, 在所有 Java 提交中击败了11.79%的用户
 */
class Solution {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root, map);
        int maxCount = 0;
        List<Integer> list = new ArrayList<>();
        for(Map.Entry entry: map.entrySet()){
            if((int)entry.getValue() > maxCount){
                maxCount = (int)entry.getValue();
                list.clear();
                list.add((int) entry.getKey());
            }else if((int)entry.getValue() == maxCount){
                list.add((int) entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public void dfs(TreeNode curNode, Map<Integer, Integer> map){
        if(curNode == null){
            return;
        }
        if(map.containsKey(curNode.val)){
            int curVal = map.get(curNode.val);
            map.put(curNode.val, curVal + 1);
        }else{
            map.put(curNode.val, 1);
        }
        dfs(curNode.left, map);
        dfs(curNode.right, map);
    }
}
