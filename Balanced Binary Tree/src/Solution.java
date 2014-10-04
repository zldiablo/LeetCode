public class Solution {
    public boolean isBalanced(TreeNode root) {
        int depth = maxDepthInternal(root, 0);
        return depth != -1;
    }
    
    private int maxDepthInternal(TreeNode root, int depth) {
		if (root == null) {
			return depth;
		} else {
			int left = maxDepthInternal(root.left, depth + 1);
			int right = maxDepthInternal(root.right, depth + 1);
			if (left == -1 || right == -1){
				return -1;
			}
			if (Math.abs(left-right)>1){
				return -1;
			}
			return Math.max(left, right);
		}
	}
}