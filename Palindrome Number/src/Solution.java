public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int length = (int) Math.log10(x) + 1;
		for (int i = 0; i < length / 2; i++) {
			boolean r = (x / (int) Math.pow(10, i)) % 10 == (x / (int) Math
					.pow(10, length - i - 1)) % 10;
			if (!r) {
				return false;
			}
		}
		return true;
	}
}