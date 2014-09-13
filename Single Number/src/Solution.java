public class Solution {
	public int singleNumber(int[] A) {
		int result = 0;
		for (int x : A) {
			result ^= x;
		}
		return result;
	}
}