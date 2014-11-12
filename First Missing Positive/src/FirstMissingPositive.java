
public class FirstMissingPositive {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] t1 = {1,2,0};
		int[] t2 = {3,4,-1,1};
		int[] t3 = {};
		int[] t4 = {-2};
		int[] t5 = {3};
		int[] t6 = {2,2};
		int[] t7 = {1,0};
		
		System.out.println(s.firstMissingPositive(t1));
		System.out.println(s.firstMissingPositive(t2));
		System.out.println(s.firstMissingPositive(t3));
		System.out.println(s.firstMissingPositive(t4));
		System.out.println(s.firstMissingPositive(t5));
		System.out.println(s.firstMissingPositive(t6));
		System.out.println(s.firstMissingPositive(t7));
	}

}
