package search.backtracking.question257;

import java.util.List;

public class question257 {
    public static void main(String[] args){
        TreeNode node10 = new TreeNode(8, null, null);
        TreeNode node9 = new TreeNode(-22, null, node10);
        TreeNode node8 = new TreeNode(-71, null, null);
        TreeNode node7 = new TreeNode(-54, node8, node9);
        TreeNode node6 = new TreeNode(48, node7, null);
        TreeNode node5 = new TreeNode(-100, null, null);
        TreeNode node4 = new TreeNode(-100, null, null);
        TreeNode node2 = new TreeNode(-34, null, node4);
        TreeNode node3 = new TreeNode(-48, node5, node6);
        TreeNode node1 = new TreeNode(37, node2, node3);
        Solution solution = new Solution();
        List<String> output = solution.binaryTreePaths(node1);
        for(String s : output){
            System.out.println(s);
        }
    }
}
