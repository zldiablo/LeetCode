public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] t1 = { 2, 1, 5, 6, 2, 3 };
		int r1 = s.largestRectangleArea(t1);
		System.out.println(r1);

		int[] t2 = {6, 2, 5, 4, 5, 1, 6};
		int r2 = s.largestRectangleArea(t2);
		System.out.println(r2);
	}

}
