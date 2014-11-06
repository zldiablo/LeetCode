public class BuySellStock {

	public static void main(String[] args) {
		int[] test = { 1, 2, 10, -4, 3, 2 };
		Solution s = new Solution();
		int r = s.maxProfit(test);
		System.out.println(r);
	}

}
