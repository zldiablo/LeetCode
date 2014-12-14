
public class SwapNodesInPairs {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		Solution s = new Solution();
		ListNode result1 = s.swapPairs(l1);
		printList(result1);
		ListNode l2 = new ListNode(2);
		l1.next = l2;
		ListNode result2 = s.swapPairs(l1);
		printList(result2);
		
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		ListNode result3 = s.swapPairs(l1);
		printList(result3);
		
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		ListNode result4 = s.swapPairs(l1);
		printList(result4);
	}
	
	public static void printList(ListNode head){
		while (head != null){
			System.out.print(head.val);
			System.out.print(" ->");
			head = head.next;
		}
		System.out.println();
	}
}
