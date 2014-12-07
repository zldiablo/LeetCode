import java.util.*;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] r = { 1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 9, 9, 9 };
		Solution s = new Solution();
		System.out.println(s.removeDuplicates(r));
		System.out.println(Arrays.asList(r));

	}

}
