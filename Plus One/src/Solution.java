import java.util.*;

public class Solution {
	public int[] plusOne(int[] digits) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		int advanced = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int current = (digits[i] + advanced) % 10;
			advanced = (digits[i] + advanced) / 10;
			result.addFirst(current);
		}

		if (advanced > 0) {
			result.addFirst(1);
		}

		int[] r = new int[result.size()];
		for (int i = 0; i < r.length; i++) {
			r[i] = result.get(i);
		}
		return r;
	}
}