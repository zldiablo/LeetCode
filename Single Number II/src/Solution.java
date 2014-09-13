public class Solution {
	public int singleNumber(int[] A) {
		int one = 0, two = 0, three = 0;
		for(int x : A){
			two |= one & x;
			one ^= x;
			three = one & two;
			one &= ~three;
			two &= ~three;
		}
		return one;
	}
}