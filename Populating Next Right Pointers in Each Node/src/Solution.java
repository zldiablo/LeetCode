
public class Solution {
	/**
	 * traversal binary tree by level
	 * @param root
	 */
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		TreeLinkNode nextLevel = null;
		TreeLinkNode prev = null;
		TreeLinkNode current = root;
		while (current != null) {
			while (current != null) {
				if (current.left != null) {
					if (prev == null) {
						nextLevel = current.left;
					} else {
						prev.next = current.left;
					}
					prev = current.left;
				}
				if (current.right != null) {
					if (prev == null) {
						nextLevel = current.right;
					} else {
						prev.next = current.right;
					}
					prev = current.right;
				}
				current = current.next;
			}
			current = nextLevel;
			nextLevel = null;
			prev = null;
		}
	}
}