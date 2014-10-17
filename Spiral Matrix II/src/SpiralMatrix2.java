public class SpiralMatrix2 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int n = 5;
		int[][] result = s.generateMatrix(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
