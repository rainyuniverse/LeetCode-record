package Tree.HierarchicalTraversal.question637;

import Tree.TreeNode;

import java.util.List;

public class question637 {
    public static void main(String[] args) {
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node15 = new TreeNode(15, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode node3 = new TreeNode(3, node9, node20);

//        Solution solution = new Solution();

        Solution1 solution1 = new Solution1();
        List<Double> list = solution1.averageOfLevels(node3);
        for(double d: list){
            System.out.print(d + " ");
        }
    }
}
