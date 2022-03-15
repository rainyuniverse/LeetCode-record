package LinkedList.question206;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode curNode = head;
        ListNode pastNode = null;
        ListNode nextNode = curNode.next;
        while(curNode.next.next != null){
            curNode.next = pastNode;
            pastNode = curNode;
            curNode = nextNode;
            nextNode = curNode.next;
        }
        curNode.next = pastNode;
        nextNode.next = curNode;
        return nextNode;
    }
}
