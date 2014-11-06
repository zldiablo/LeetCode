public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}

		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			int current = prices[i] - prices[i - 1];
			if (current > 0) {
				profit += current;
			}
		}

		return profit;

	}
}