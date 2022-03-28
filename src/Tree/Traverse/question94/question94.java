package Tree.Traverse.question94;

import Tree.TreeNode;

import java.util.List;

public class question94 {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node3 = new TreeNode(3, node1, node2);

        Solution solution = new Solution();
        List<Integer> res = solution.inorderTraversal(node3);
        for(Integer i : res){
            System.out.print(i + " ");
        }
    }
}
