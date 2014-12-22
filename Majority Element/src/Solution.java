import java.util.Stack;

public class Solution {
	public int majorityElement(int[] num) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (s.isEmpty()) {
				s.push(num[i]);
			} else {
				int top = s.peek();
				if (top == num[i]) {
					s.push(top);
				} else {
					s.pop();
				}
			}
		}
		return s.peek();
	}
}