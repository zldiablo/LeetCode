import java.util.*;

public class Solution {
	public boolean wordBreak(String s, Set<String> dict) {
		if (s == null || s.length() == 0)
			return true;
		if (dict.size() == 0)
			return false;
		if (dict.contains(s))
			return true;

		int length = s.length();
		boolean[] dp = new boolean[length + 1];
		dp[length] = true;

		for (int i = length - 1; i >= 0; i--) {
			for (int j = i; j < length; j++) {
				String part1 = s.substring(i, j + 1);
				if (dict.contains(part1) && dp[j + 1]) {
					dp[i] = true;
					break;
				}
			}
		}

		return dp[0];
	}
}