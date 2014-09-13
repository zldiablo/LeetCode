public class Solution {
	public String longestCommonPrefix(String[] strs) {
		int minLength = 100000000;
		if (strs.length == 0) {
			minLength = 0;
		}
		for (String s : strs) {
			if (s.length() < minLength) {
				minLength = s.length();
			}
		}

		StringBuilder sb = new StringBuilder();

		boolean flag = true;
		for (int i = 0; i < minLength && flag; i++) {
			char current = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != current) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sb.append(current);
			}
		}

		return sb.toString();
	}
}