public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}
		int lastStep = 0;
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			int current = prices[i] - prices[i - 1];
			if (lastStep + current >= 0) {
				lastStep += current;
				if (lastStep > profit) {
					profit = lastStep;
				}
			} else {
				lastStep = 0;
			}
		}

		return profit;

	}
}