package LinkedList.question138;

import java.util.HashMap;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：40.8 MB, 在所有 Java 提交中击败了50.06%的用户
 */
class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node curNode = head;
        // 初始化节点并与原先节点一一对应
        while(curNode != null){
            Node newNode = new Node(curNode.val);
            map.put(curNode, newNode);
            curNode = curNode.next;
        }
        // 处理next
        curNode = head;
        Node curNewNode = map.get(curNode);
        while(curNode != null){
            curNewNode.next = map.get(curNode.next);
            curNewNode = curNewNode.next;
            curNode = curNode.next;
        }
        // 处理random
        curNode = head;
        curNewNode = map.get(curNode);
        while(curNode != null){
            if(curNode.random == null){
                curNewNode.random = null;
            }else{
                curNewNode.random = map.get(curNode.random);
            }
            curNode = curNode.next;
            curNewNode = curNewNode.next;
        }
        return map.get(head);
    }
}
