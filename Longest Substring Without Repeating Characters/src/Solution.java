import java.util.*;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0)
			return 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int result = 0;
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				Integer lastSeen = map.get(c);
				if (lastSeen >= start) {
					result = Math.max(result, i - start);
					start = lastSeen + 1;
				}
			}
			map.put(c, i);

		}
		result = Math.max(result, s.length() - start);

		return result;
	}
}