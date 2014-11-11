import java.util.*;

public class WordBreak {

	public static void main(String[] args) {
		Solution s = new Solution();
//		Set<String> dict1 = new HashSet<String>();
//		dict1.add("leet");
//		dict1.add("code");
//		System.out.println(s.wordBreak("leetcode", dict1));
//		System.out.println(s.wordBreak("leetcode2", dict1));
//		
		Set<String> dict2 = new HashSet<String>();
		dict2.add("a");
		dict2.add("bc");
		dict2.add("d");
		System.out.println(s.wordBreak("adbc", dict2));
		System.out.println(s.wordBreak("abcd", dict2));
		System.out.println(s.wordBreak("abdc", dict2));
	}

}
