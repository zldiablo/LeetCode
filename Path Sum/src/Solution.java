public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		
		if (root.left == null && root.right == null) {
			return root.val == sum;
		}
		
		boolean leftResult = false;
		boolean rightResult = false;
		if (root.left != null) {
			leftResult = hasPathSum(root.left, sum - root.val);
		}
		if (root.right != null) {
			rightResult = hasPathSum(root.right, sum - root.val);
		}
		return leftResult || rightResult;
	}
}
