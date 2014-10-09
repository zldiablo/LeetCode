import java.util.*;

public class Solution {
	HashMap<Integer, List<List<Integer>>> sumMap;

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		if (root == null) {
			return new LinkedList<List<Integer>>();
		}
		sumMap = new HashMap<Integer, List<List<Integer>>>();
		List<Integer> path = new LinkedList<Integer>();
		sumMap.put(sum, new LinkedList<List<Integer>>());
		generatePaths(root, sum, path);
		return sumMap.get(sum);
	}

	private void generatePaths(TreeNode root, int sum, List<Integer> path) {
		path.add(root.val);
		if (root.left == null && root.right == null) {
			int r = 0;
			for (Integer e : path) {
				r += e;
			}
			if (r == sum) {
				List<List<Integer>> current = sumMap.get(sum);
				List<Integer> p = new LinkedList<Integer>();
				p.addAll(path);
				current.add(p);
			}
		}
		
		if (root.left != null) {
			generatePaths(root.left, sum, path);
		}
		if (root.right != null) {
			generatePaths(root.right, sum, path);
		}
		path.remove(path.size()-1);
	}
}
