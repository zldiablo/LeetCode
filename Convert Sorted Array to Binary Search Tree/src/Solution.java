public class Solution {
	public TreeNode sortedArrayToBST(int[] num) {
		return convertArrayToBSTInternal(num, 0, num.length);
	}

	private TreeNode convertArrayToBSTInternal(int[] num, int begin, int end) {
		if (end <= begin) {
			return null;
		}
		if (end - begin == 1) {
			return new TreeNode(num[begin]);
		}
		int middle = (begin + end) / 2;
		TreeNode root = new TreeNode(num[middle]);
		root.left = convertArrayToBSTInternal(num, begin, middle);
		root.right = convertArrayToBSTInternal(num, middle + 1, end);
		return root;
	}
}