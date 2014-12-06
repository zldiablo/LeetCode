import java.util.Arrays;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;

		// binary search rows
		int low = 0, high = rows - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (matrix[mid][0] > target) {
				high = mid - 1;
			} else if (matrix[mid][0] < target) {
				low = mid + 1;
			} else {
				return true;
			}
		}

		if (low > 0) {
			low = low - 1;
		}
		int r = Arrays.binarySearch(matrix[low], target);
		if (r >= 0) {
			return true;
		}
		return false;

	}
}