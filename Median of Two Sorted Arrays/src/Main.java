public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] a = { 1 };
		int[] b = { 2 };
		System.out.println(s.findMedianSortedArrays(a, b));
		int[] c = { 2, 2, 2 };
		int[] d = { 2, 2, 2, 2 };
		System.out.println(s.findMedianSortedArrays(c, d));
	}

}