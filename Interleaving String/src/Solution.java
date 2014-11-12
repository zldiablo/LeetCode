public class Solution {
	public boolean isInterleave(String s1, String s2, String s3) {
		int length1 = s1.length();
		int length2 = s2.length();

		if (s3.length() != length2 + length1) {
			return false;
		}

		boolean[][] dp = new boolean[length1 + 1][length2 + 1];
		dp[0][0] = true;
		for (int i = 1; i <= length1; i++) {
			dp[i][0] = dp[i - 1][0] && (s3.charAt(i - 1) == s1.charAt(i - 1));
		}

		for (int j = 1; j <= length2; j++) {
			dp[0][j] = dp[0][j - 1] && (s3.charAt(j - 1) == s2.charAt(j - 1));
		}

		for (int i = 1; i <= length1; i++) {
			for (int j = 1; j <= length2; j++) {
				char c = s3.charAt(i + j - 1);
				dp[i][j] = (dp[i - 1][j] && (c == s1.charAt(i - 1)))
						|| (dp[i][j - 1] && (c == s2.charAt(j - 1)));
			}
		}

		return dp[length1][length2];
	}
}