public class Solution {
	// not a constant space solution
	public int firstMissingPositive(int[] A) {
		int maxPositive = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > maxPositive) {
				maxPositive = A[i];
			}
		}

		boolean[] exists = new boolean[maxPositive + 1];

		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 0) {
				exists[A[i]] = true;
			}
		}

		for (int i = 1; i < exists.length; i++) {
			if (!exists[i]) {
				return i;
			}
		}
		return maxPositive + 1;
	}
}