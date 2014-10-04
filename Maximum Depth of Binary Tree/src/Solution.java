public class Solution {
	public int maxDepth(TreeNode root) {
		return maxDepthInternal(root, 0);
	}

	private int maxDepthInternal(TreeNode root, int depth) {
		if (root == null) {
			return depth;
		} else {
			int left = maxDepthInternal(root.left, depth + 1);
			int right = maxDepthInternal(root.right, depth + 1);
			return Math.max(left, right);
		}
	}

}