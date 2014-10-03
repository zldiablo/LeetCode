public class Solution {

	static int[] result;

	static {
		result = new int[50];
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < 50; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}
	}

	public int climbStairs(int n) {
		return result[n];
	}
}