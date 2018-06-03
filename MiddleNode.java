package basic4;
import java.util.*;
public class MiddleNode {
    public ListNode middleNode(ListNode head){
        if(head == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
