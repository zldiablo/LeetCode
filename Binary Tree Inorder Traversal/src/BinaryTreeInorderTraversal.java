import java.util.List;


public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n2.right = n5;
		
		Solution s = new Solution();
		List<Integer> result = s.inorderTraversal(n1);
		System.out.println(result);
	}

}
