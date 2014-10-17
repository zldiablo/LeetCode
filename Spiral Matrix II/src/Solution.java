public class Solution {
	public int[][] generateMatrix(int n) {
		int[][] result = new int[n][];
		for (int i = 0; i < n; i++) {
			result[i] = new int[n];
		}

		int i = 0;
		int j = 0;

		int rightStep = n - 1;
		int leftStep = n - 1;
		int upStep = n - 1;
		int downStep = n - 1;

		int rightGap = 0;
		int leftGap = 0;
		int upGap = 0;
		int downGap = 0;
		
		int num = 1;

		for (int c = 0; c < n * n; c++) {
			result[i][j] = num++;
			
			if (rightStep > 0) {
				j++;
				rightStep--;
				if (rightStep == 0) {
					upGap++;
					downGap++;
					downStep = n - downGap;
				}
				continue;
			}
			if (downStep > 0) {
				i++;
				downStep--;
				if (downStep == 0) {
					rightGap++;
					leftGap++;
					leftStep = n - leftGap;
				}
				continue;
			}
			if (leftStep > 0) {
				j--;
				leftStep--;
				if (leftStep == 0) {
					downGap++;
					upGap++;
					upStep = n - upGap;
				}
				continue;
			}
			if (upStep > 0) {
				i--;
				upStep--;
				if (upStep == 0) {
					leftGap++;
					rightGap++;
					rightStep = n - rightGap;
				}
				continue;
			}
		}

		return result;
	}
}