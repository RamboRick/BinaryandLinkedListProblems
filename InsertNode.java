package basic4;
import java.util.*;
public class InsertNode {
    public ListNode insert(ListNode head, int value){
        if(head == null || value <= head.value){
            ListNode newHead = new ListNode(value);
            newHead.next = head;
            return newHead;
        }
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null && cur.value < value){
            prev = cur;
            cur = cur.next;
        }
        prev.next = new ListNode(value);
        prev.next.next =cur;
        return head;
    }
}

