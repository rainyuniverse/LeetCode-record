package Tree.Traverse.question144;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class question144 {
    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node3 = new TreeNode(3, node1, node2);

        Solution1 solution1 = new Solution1();
        List<Integer> list = new ArrayList<>();
        list = solution1.preorderTraversal(node3);
        for(Integer i: list){
            System.out.print(i + " ");
        }
    }
}
