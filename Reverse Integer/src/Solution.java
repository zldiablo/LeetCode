public class Solution {
	public int reverse(int x) {
		boolean minus = false;
		if (x < 0) {
			minus = true;
			x = x * -1;
		}
		String input = x + "";
		String output = new StringBuilder(input).reverse().toString();
		int value = Integer.parseInt(output);
		if (minus) {
			value *= -1;
		}
		return value;
	}
}