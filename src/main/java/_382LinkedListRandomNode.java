package main.java;

import main.java.Collections.ListNode;

import java.util.Random;

/**
 * Created by fankai on 2016/11/29.
 */
public class _382LinkedListRandomNode {
    public ListNode head;
    public int count = 0;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public _382LinkedListRandomNode(ListNode head) {
        this.head = head;
        for (ListNode i = head; i.next!=null;i = i.next){
            this.count++;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        Random random = new Random();
        int index =   0;
        index = random.nextInt(this.count + 1);
        ListNode temp = head;
        for(int i = 0; i <= index; i ++ ){
            if (i == index)
                return temp.val;
            else temp = temp.next;
        }
        return 0;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
