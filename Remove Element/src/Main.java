public class Main {
	public static void main(String[] args) {
		int[] A = { 3, 3, 4, 5 };
		Test(A, 3);
		int[] B = { 3 };
		Test(B, 3);
		int[] C = { 3, 3 };
		Test(C, 3);
		int[] D = {};
		Test(D, 3);
		int[] E = { 2, 3, 3 };
		Test(E, 3);
		int[] F ={4,2,0,2,2,1,4,4,1,4,3,2};
		Test(F,4);
	}

	private static void Test(int[] A, int e) {
		Solution s = new Solution();
		int r = s.removeElement(A, e);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println(r);
	}
}
