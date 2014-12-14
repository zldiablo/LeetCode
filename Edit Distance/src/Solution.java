public class Solution {
	public int minDistance(String word1, String word2) {
		int row = word1.length();
		int column = word2.length();
		if (row <= 0)
			return column;
		if (column <= 0)
			return row;

		int[][] result = new int[row + 1][column + 1];
		result[0][0] = 0;

		for (int i = 1; i <= row; i++) {
			result[i][0] = i;
		}
		for (int j = 1; j <= column; j++) {
			result[0][j] = j;
		}

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				int gap = word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1;

				result[i][j] = Math.min(result[i - 1][j - 1] + gap,
						Math.min(result[i][j - 1] + 1, result[i - 1][j] + 1));
			}
		}

//		for (int i = 0; i <= row; i++) {
//			for (int j = 0; j <= column; j++) {
//				System.out.print(result[i][j] + " ");
//			}
//			System.out.println();
//		}

		return result[row][column];
	}
}