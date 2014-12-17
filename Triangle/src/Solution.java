import java.util.List;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		int level = triangle.size() - 1;
		int[] temp = new int[level + 2];
		while (level >= 0) {
			for (int i = 0; i < level + 1; i++) {
				int value = triangle.get(level).get(i);
				temp[i] = value + Math.min(temp[i], temp[i + 1]);
			}
			level--;
		}
		return temp[0];
	}

}