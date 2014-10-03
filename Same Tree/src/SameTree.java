
public class SameTree {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(4);
		p1.left = p2;
		p1.right = p3;
		//p3.left = p4;
		
		Solution s = new Solution();
		boolean r = s.isSameTree(n1, p1);
		System.out.println(r);
	}

}
