public class Solution {
	public double findMedianSortedArrays(int A[], int B[]) {
		int count = A.length + B.length;
		int target = count / 2;
		int i = 0, j = 0;
		int current = 0;
		int result = 0, previous = 0;
		while (current <= target && (i < A.length || j < B.length)) {
			previous = result;
			if (i >= A.length) {
				result = B[j];
				j++;
			} else if (j >= B.length) {
				result = A[i];
				i++;
			} else if (A[i] < B[j]) {
				result = A[i];
				i++;
			} else {
				result = B[j];
				j++;
			}
			current++;
		}
		if (count % 2 == 0) {
			return (result + previous) / 2.0;
		} else {
			return result;
		}
	}
}