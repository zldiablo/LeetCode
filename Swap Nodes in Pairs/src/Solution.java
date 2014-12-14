
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode p1 = preHead;
        while(p1 != null && p1.next != null && p1.next.next != null){
        	ListNode t1 = p1.next;
        	ListNode t2 = p1.next.next;
        	p1.next = t2;
        	t1.next = t2.next;
        	t2.next = t1;
        	p1 = t1;
        }
        return preHead.next;
    }
}