public class EditDistance {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "abd";
		String s4 = "abcd";
		String s5 = "ad";

		String s6 = "zoologicoarchaeologist";
		String s7 = "zoogeologist";
		
		String s8 = "sea";
		String s9 = "eat";
		
		String s10 = "pneumonoultramicroscopicsilicovolcanoconiosis";
		String s11 = "ultramicroscopically";
		
		String s12 = "a";
		String s13 = "b";

		Solution s = new Solution();
//		System.out.println(s.minDistance(s1, s2));
//		System.out.println(s.minDistance(s1, s3));
//		System.out.println(s.minDistance(s1, s4));
//		System.out.println(s.minDistance(s1, s5));
//
//		System.out.println(s.minDistance(s6, s7));
//		System.out.println(s.minDistance(s8, s9));
//		System.out.println(s.minDistance(s10, s11));
		System.out.println(s.minDistance(s12, s13));
	}

}
