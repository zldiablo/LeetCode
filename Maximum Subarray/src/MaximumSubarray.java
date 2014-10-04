public class MaximumSubarray {

	public static void main(String[] args) {
		int[] t = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		Solution s = new Solution();
		int r = s.maxSubArray(t);
		System.out.println(r);
	}

}
