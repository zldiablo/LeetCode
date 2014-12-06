public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int[] diff = new int[gas.length];

		for (int i = 0; i < diff.length; i++) {
			diff[i] = gas[i] - cost[i];
		}

		int start = gas.length - 1;
		int end = 0;
		int sum = diff[start];
		while (start > end) {
			if (sum >= 0) {
				sum += diff[end];
				++end;
			} else {
				--start;
				sum += diff[start];
			}
		}
		return sum >= 0 ? start : -1;
	}
}