
public class PartitionList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		l1.next = l2;
		Solution s = new Solution();
		ListNode head = s.partition(l1, 2);
		printList(head);
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
