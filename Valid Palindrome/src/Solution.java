
public class Solution {
	public boolean isPalindrome(String s) {
		String substring = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//		System.out.println(substring);

		if (substring.length() == 0) {
			return true;
		}

		for (int i = 0; i < substring.length() / 2; i++) {
			if (substring.charAt(i) == substring.charAt(substring.length() - i
					- 1)) {
				continue;
			} else {
				return false;
			}
		}

		return true;
	}
}