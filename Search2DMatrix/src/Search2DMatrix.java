public class Search2DMatrix {

	public static void main(String[] args) {
		int r[][] = new int[3][];
		r[0] = new int[] { 1, 3, 5, 7 };
		r[1] = new int[] { 10, 11, 16, 20 };
		r[2] = new int[] { 23, 30, 34, 50 };
		
		Solution s = new Solution();
		boolean t = s.searchMatrix(r, 18);
		System.out.println(t);
		
		int r2[][] = new int[1][];
		r2[0] = new int[] {1};
		boolean t2 = s.searchMatrix(r2, 1);
		System.out.println(t2);
	}

}
