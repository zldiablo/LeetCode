public class ValidPalindrome {

	public static void main(String[] args) {
		String t1 = "A man, a plan, a canal: Panama";
		String t2 = "1a2";
		String t3 = "a.b,.";
		Solution s = new Solution();
		
		System.out.println(s.isPalindrome(t1));
		System.out.println(s.isPalindrome(t2));
		System.out.println(s.isPalindrome(t3));
	}

}
