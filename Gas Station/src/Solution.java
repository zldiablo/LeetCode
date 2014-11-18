public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int[] diff = new int[gas.length];

		for (int i = 0; i < diff.length; i++) {
			diff[i] = gas[i] - cost[i];
		}

		int sum = 0;
		boolean found = false;
		int savedIndex = 0;
		for (int i = 0; i < diff.length; i++) {
			sum += diff[i];
			if (!found) {
				savedIndex = i;
				found = true;
			}
			if (sum < 0 && diff[i] < 0) {
				found = false;
			}
		}

		if (sum < 0) {
			return -1;
		} else {
			return savedIndex;
		}
	}
}