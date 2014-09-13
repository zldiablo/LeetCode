public class Solution {
	public String reverseWords(String s) {
		String[] input = s.trim().split("\\s");
		StringBuilder sb = new StringBuilder();
		for (int i = input.length - 1; i >= 0; i--) {
			if (input[i] != null && input[i].length() > 0) {
				sb.append(input[i]);
				if (i > 0) {
					sb.append(' ');
				}
			}
		}
		return sb.toString();
	}
}