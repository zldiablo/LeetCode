public class Solution {
	public int removeDuplicates(int[] A) {
		int result = 0, slow = 0, fast = 0;
		while (slow < A.length && fast < A.length) {
			while (fast < A.length && A[slow] == A[fast]) {
				fast++;
			}
			A[result++] = A[slow];
			slow = fast;
		}

		return result;
	}
}