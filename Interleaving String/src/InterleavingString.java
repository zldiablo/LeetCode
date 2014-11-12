public class InterleavingString {

	public static void main(String[] args) {
		Solution s = new Solution();
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbcbcac";
		String s4 = "aadbbbaccc";

		System.out.println(s.isInterleave(s1, s2, s3));
		System.out.println(s.isInterleave(s1, s2, s4));

		System.out.println(s.isInterleave("abbc", "db", "abbdbc"));
		
		System.out.println(s.isInterleave("a", "", "a"));
		System.out.println(s.isInterleave("", "a", "a"));
	}

}
