public class Solution {
	public int maxSubArray(int[] A) {
		// all negative
		int result = A[0];
		for (int i = 1; i < A.length; i++) {
			result = Math.max(result, A[i]);
		}
		if (result < 0) {
			return result;
		}

		int[] F = new int[A.length];
		F[0] = Math.max(0, A[0]);
		for (int i = 1; i < A.length; i++) {
			F[i] = Math.max(0, F[i - 1] + A[i]);
		}

		result = F[0];
		for (int i = 1; i < F.length; i++) {
			result = Math.max(result, F[i]);
		}
		return result;
	}
}