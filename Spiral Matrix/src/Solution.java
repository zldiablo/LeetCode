import java.util.*;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		if (matrix.length == 0)
		{
			return result;
		}
		int y = matrix.length;
		int x = matrix[0].length;
		int total = x * y;
		

		int i = 0;
		int j = 0;

		int rightStep = x - 1;
		int leftStep = x - 1;
		int upStep = y - 1;
		int downStep = y - 1;

		int rightGap = 0;
		int leftGap = 0;
		int upGap = 0;
		int downGap = 0;

		for (int c = 0; c < total; c++) {
			result.add(matrix[i][j]);
			if (rightStep > 0) {
				j++;
				rightStep--;
				if (rightStep == 0) {
					upGap++;
					downGap++;
					downStep = y - downGap;
				}
				continue;
			}
			if (downStep > 0) {
				i++;
				downStep--;
				if (downStep == 0) {
					rightGap++;
					leftGap++;
					leftStep = x - leftGap;
				}
				continue;
			}
			if (leftStep > 0) {
				j--;
				leftStep--;
				if (leftStep == 0) {
					downGap++;
					upGap++;
					upStep = y - upGap;
				}
				continue;
			}
			if (upStep > 0) {
				i--;
				upStep--;
				if (upStep == 0) {
					leftGap++;
					rightGap++;
					rightStep = x - rightGap;
				}
				continue;
			}
		}

		return result;
	}
}