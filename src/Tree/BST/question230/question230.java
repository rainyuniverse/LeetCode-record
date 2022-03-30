package Tree.BST.question230;

import Tree.TreeNode;


public class question230 {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node1 = new TreeNode(1, null, node2);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, node1, node4);

        Solution1 solution1 = new Solution1();
        System.out.print(solution1.kthSmallest(node3, 3));
    }
}
