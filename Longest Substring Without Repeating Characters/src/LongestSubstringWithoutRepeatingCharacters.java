
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s1 = "abcabcbb";
		Solution s = new Solution();
		int r1 = s.lengthOfLongestSubstring(s1);
		System.out.println(r1);
		String s2 = "bbbbb";
		int r2 = s.lengthOfLongestSubstring(s2);
		System.out.println(r2);
		String s3 = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco";
		int r3 = s.lengthOfLongestSubstring(s3);
		System.out.println(r3);
		
	}

}
