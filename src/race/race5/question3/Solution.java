package race.race5.question3;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<Integer> list = new ArrayList<>();
    public int getNumber(TreeNode root, int[][] ops) {
        dfs(root);
        int[] color = new int[list.size()];
        int[] visited = new int[list.size()];
        int num = 0;
        for(int i = ops.length - 1; i >= 0; i--){
            int first = list.indexOf(ops[i][1]);
            int last = list.indexOf(ops[i][2]);
            for(int j = first; j <= last; j++){
                if(visited[j] == 1){
                    continue;
                }
                color[j] = ops[i][0];
                visited[j] = 1;
                num++;
            }
            if(num == list.size()){
                break;
            }

        }

        int count = 0;
        for(int i = 0; i < color.length; i++){
            if(color[i] == 1){
                count++;
            }
        }
        return count;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
