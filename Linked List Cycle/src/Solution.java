public class Solution {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode p1 = head;
		ListNode p2 = head.next;
		while (p1 != null && p2 != null) {
			if (p1 == p2) {
				return true;
			}
			p1 = p1.next;
			p2 = p2.next;
			if (p2 == null) {
				return false;
			} else {
				p2 = p2.next;
			}
		}
		return false;
	}
}
