public class Solution {
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int column = grid[0].length;
		int[][] result = new int[row][];
		for (int i = 0; i < row; i++) {
			result[i] = new int[column];
		}

		result[0][0] = grid[0][0];

		for (int i = 1; i < row; i++) {
			result[i][0] = result[i - 1][0] + grid[i][0];
		}

		for (int i = 1; i < column; i++) {
			result[0][i] = result[0][i - 1] + grid[0][i];
		}

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < column; j++) {
				result[i][j] = Math.min(result[i - 1][j], result[i][j - 1])
						+ grid[i][j];
			}
		}

		// last item is result
		return result[row - 1][column - 1];
	}
}