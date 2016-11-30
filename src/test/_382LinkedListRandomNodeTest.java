package test;

import main.java.Collections.ListNode;
import main.java._382LinkedListRandomNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fankai on 2016/11/30.
 */
public class _382LinkedListRandomNodeTest {
    @Test
    public void getRandom() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        _382LinkedListRandomNode _382LinkedListRandomNode = new _382LinkedListRandomNode(head);
        int[] results = {1,2,3};
    }

}