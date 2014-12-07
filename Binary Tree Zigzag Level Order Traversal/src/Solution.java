import java.util.*;

public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}
		Queue<LevelTreeNode> queue = new LinkedList<LevelTreeNode>();
		int level = 0;
		LinkedList<Integer> currentLevel = new LinkedList<Integer>();
		result.add(currentLevel);
		queue.add(new LevelTreeNode(root, 0));
		boolean flag = true;
		while (!queue.isEmpty()) {
			LevelTreeNode l = queue.poll();
			if (l.level == level) {
				if (flag) {
					currentLevel.addLast(l.val);
				} else {
					currentLevel.addFirst(l.val);
				}
			} else {
				level = l.level;
				currentLevel = new LinkedList<Integer>();
				flag = !flag;
				currentLevel.add(l.val);
				result.add(currentLevel);
			}
			if (l.left != null) {
				queue.add(new LevelTreeNode(l.left, l.level + 1));
			}
			if (l.right != null) {
				queue.add(new LevelTreeNode(l.right, l.level + 1));
			}
		}
		return result;
	}
}

class LevelTreeNode extends TreeNode {
	int level;

	LevelTreeNode(TreeNode node, int level) {
		super(node.val);
		left = node.left;
		right = node.right;
		this.level = level;
	}
}