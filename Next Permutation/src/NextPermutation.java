public class NextPermutation {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] t1 = { 1, 2, 3, 4 };
		s.nextPermutation(t1);
		printIntArray(t1);
		int[] t2 = { 4, 3, 2, 1 };
		s.nextPermutation(t2);
		printIntArray(t2);
		int[] t3 = { 2, 3, 1, 4 };
		s.nextPermutation(t3);
		printIntArray(t3);
		int[] t4 = { 1, 1, 5 };
		s.nextPermutation(t4);
		printIntArray(t4);

		int[] t5 = { 2, 3, 1 };
		s.nextPermutation(t5);
		printIntArray(t5);
		
		int[] t6 = { 3, 2, 1 };
		s.nextPermutation(t6);
		printIntArray(t6);
	}

	static void printIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

}
