public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}

		int[] diff = new int[prices.length - 1];

		for (int i = 1; i < prices.length; i++) {
			diff[i - 1] = prices[i] - prices[i - 1];
		}
		int max = Integer.MIN_VALUE;

		int[] max1 = maxSubSum(diff);
		for (int i = 0; i < max1.length; i++) {
			max = Math.max(max, max1[i]);
		}
		for (int i = 1; i < max1.length; i++) {
			if (max1[i] < max1[i - 1]) {
				max1[i] = max1[i - 1];
			}
		}

		int[] max2 = maxSubSumReverse(diff);
		for (int i = max2.length - 2; i >= 0; i--) {
			if (max2[i] < max2[i + 1]) {
				max2[i] = max2[i + 1];
			}
		}

		for (int i = 0; i < diff.length - 2; i++) {
			max = Math.max(max, max1[i] + max2[i + 1]);
		}
		return max;
	}

	private int[] maxSubSum(int[] array) {
		int[] result = new int[array.length];
		result[0] = Math.max(0, array[0]);
		for (int i = 1; i < array.length; i++) {
			if (result[i - 1] + array[i] > 0) {
				result[i] = result[i - 1] + array[i];
			} else {
				result[i] = 0;
			}
		}

		return result;
	}

	private int[] maxSubSumReverse(int[] array) {
		int length = array.length;
		int[] result = new int[length];
		result[length - 1] = Math.max(0, array[length - 1]);

		for (int i = length - 2; i >= 0; i--) {
			if (result[i + 1] + array[i] > 0) {
				result[i] = result[i + 1] + array[i];
			} else {
				result[i] = 0;
			}
		}

		return result;
	}
}