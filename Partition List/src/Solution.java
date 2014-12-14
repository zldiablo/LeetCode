public class Solution {
	public ListNode partition(ListNode head, int x) {
		ListNode headOfL1 = new ListNode(0);
		ListNode headOfL2 = new ListNode(0);
		ListNode endOfL1 = headOfL1;
		ListNode endOfL2 = headOfL2;
		while (head != null) {
			ListNode current = head;
			head = head.next;
			if (current.val < x) {
				endOfL1.next = current;
				endOfL1 = endOfL1.next;
			} else {
				endOfL2.next = current;
				endOfL2 = endOfL2.next;
			}
		}
		endOfL1.next = headOfL2.next;
		endOfL2.next = null;
		return headOfL1.next;
	}
}