public class Solution {
	public int firstMissingPositive(int[] A) {
		if (A.length == 0) {
			return 1;
		} else if (A.length == 1) {
			if (A[0] == 1) {
				return 2;
			} else {
				return 1;
			}
		}
		int min = Math.min(A[0], A[1]);
		int max = Math.max(A[0], A[1]);

		for (int i = 2; i < A.length; i++) {
			int c = A[i];
			if (c < 0) {
				continue;
			}
			if (c < min) {
				if (c == min - 1) {
					min = c;
				} else {
					return c + 1;
				}
			} else if (c > max) {
				if (c == max + 1) {
					max = c;
				} else {
					return max + 1;
				}
			}
		}
		if (min != 1) {
			return 1;
		} else {
			return max + 1;
		}
	}
}