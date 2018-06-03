package basic4;
import java.util.*;
public class MergeTwoLInkedList {
    public ListNode merge(ListNode one, ListNode two){
        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
        ListNode c1 = one;
        ListNode c2 = two;
        while(c1 != null && c2 != null){
            if(c1.value < c2.value){
                cur.next = c1;
                c1 = c1.next;
            }else {
                cur.next = c2;
                c2 = c2.next;
            }
            cur =cur.next;
        }
        if(c1 != null){
            cur.next = c1;
        }
        if(c2!=null){
            cur.next = c2;
        }
        return newHead.next;
    }
}
