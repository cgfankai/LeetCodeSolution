package main.java;

import main.java.Collections.ListNode;

/**
 * Created by fankai on 2016/11/29.
 */
public class _382LinkedListRandomNode {
    ListNode head;
    int count = 1;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public _382LinkedListRandomNode(ListNode head) {
        this.head = head;
        for (ListNode i = head; i.next!=null;i = i.next){
            count++;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        return  (int)(Math.random() * count) + 1;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
