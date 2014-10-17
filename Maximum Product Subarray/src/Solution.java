public class Solution {
	public int maxProduct(int[] A) {
		if (A.length == 0)
			return 0;

		int result = Math.max(0, A[0]);

		int maxPre = A[0];
		int minPre = A[0];
		int maxNow = A[0];
		int minNow = A[0];

		for (int i = 1; i < A.length; i++) {
			maxNow = Math.max(Math.max(maxPre * A[i], minPre * A[i]), A[i]);
			minNow = Math.min(Math.min(maxPre * A[i], minPre * A[i]), A[i]);
			result = Math.max(maxNow, result);
			maxPre = maxNow;
			minPre = minNow;

		}
		return result;
	}
}