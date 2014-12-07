import java.util.List;


public class BinaryTreeLevelOrderTraversal2 {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		
		Solution s= new Solution();
		List<List<Integer>> r = s.levelOrderBottom(n1);
		System.out.println(r);
		
		List<List<Integer>> r2 = s.levelOrderBottom(null);
		System.out.println(r2);
	}

}
