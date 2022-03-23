package Tree.recursion.question617;

import Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class question617 {
    public static void main(String[] args) {
        TreeNode node15 = new TreeNode(5, null, null);
        TreeNode node13 = new TreeNode(3, node15, null);
        TreeNode node12 = new TreeNode(2, null, null);
        TreeNode node11 = new TreeNode(1, node13, node12);

        TreeNode node24 = new TreeNode(4, null, null);
        TreeNode node27 = new TreeNode(7, null, null);
        TreeNode node21 = new TreeNode(1, null, node24);
        TreeNode node23 = new TreeNode(3, null, node27);
        TreeNode node22 = new TreeNode(2, node21, node23);

        Solution solution = new Solution();
        TreeNode root = solution.mergeTrees(node11, node22);

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        while(!deque.isEmpty()){
            TreeNode curNode = deque.removeFirst();
            System.out.print(curNode.val + " ");
            if(curNode.val == 0){
                continue;
            }
            TreeNode curLeft = curNode.left;
            TreeNode curRight = curNode.right;
            if(curLeft != null){
                deque.addLast(curLeft);
            }else{
                deque.addLast(new TreeNode());
            }
            if(curRight != null){
                deque.addLast(curRight);
            }else{
                deque.addLast(new TreeNode());
            }
        }
    }
}
