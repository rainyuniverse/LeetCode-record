package LinkedList.question206;

import java.util.List;

public class question206 {
    public static void main(String[] args) {
//        ListNode node5 = new ListNode(5,null);
//        ListNode node4 = new ListNode(4, node5);
//        ListNode node3 = new ListNode(3, node4);
//        ListNode node2 = new ListNode(2, null);
//        ListNode node1 = new ListNode(1, node2);

        ListNode node = null;
        System.out.println(node);

        Solution solution = new Solution();
        ListNode curNode = solution.reverseList(node);

        while(curNode != null){
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }
    }
}
