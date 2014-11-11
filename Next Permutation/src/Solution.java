import java.util.Arrays;

public class Solution {
	public void nextPermutation(int[] num) {
		if (num.length <= 1) {
			return;
		}

		int length = num.length;
		int i = length - 1;
		for (; i > 0; i--) {
			if (num[i - 1] < num[i]) {
				break;
			}
		}
		int ptr2 = i;

		int ptr1 = i - 1;

		if (ptr1 < 0) {
			ptr1 = 0;
			ptr2 = length - 1;
		} else {
			for (int j = length - 1; j > i; j--) {
				if (num[j] > num[ptr1]) {
					ptr2 = j;
					break;
				}
			}
		}

		int temp = num[ptr2];
		num[ptr2] = num[ptr1];
		num[ptr1] = temp;

		// sort second part
		Arrays.sort(num, ptr1 + 1, length);
	}
}