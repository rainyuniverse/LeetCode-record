package Tree.HierarchicalTraversal.question513;

import Tree.TreeNode;

public class question513 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node1, node3);

        Solution solution = new Solution();

        Solution1 solution1 = new Solution1();
        System.out.print(solution1.findBottomLeftValue(node2));
    }
}
