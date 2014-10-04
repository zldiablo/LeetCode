import java.util.*;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		inorderTraversalInternal(root, result);
		return result;
	}

	private void inorderTraversalInternal(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}
		inorderTraversalInternal(root.left, result);
		result.add(root.val);
		inorderTraversalInternal(root.right, result);
	}
}