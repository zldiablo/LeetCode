public class Solution {
	public int removeElement(int[] A, int elem) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == elem) {
				count++;
			}
		}
		
		int end = A.length;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == elem) {
				int j = getLastAvailablePosition(A, elem);
				if (j >= 0 && j > i && j < end) {
					end = j;
					int k = A[j];
					A[j] = A[i];
					A[i] = k;
				}
			}
		}
		return A.length - count;
	}

	private int getLastAvailablePosition(int A[], int elem) {
		int position = A.length - 1;
		while (position >= 0 && A[position] == elem) {
			position--;
		}
		return position;
	}
}