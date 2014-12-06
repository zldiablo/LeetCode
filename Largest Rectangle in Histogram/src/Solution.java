import java.util.*;

public class Solution {
	public int largestRectangleArea(int[] height) {
		Stack<Integer> stack = new Stack<Integer>();
		int maxArea = 0;
		int i = 0;
		while (i < height.length) {
			if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
				stack.push(i);
				i++;
			} else {
				int top = stack.pop();
				int left = stack.isEmpty() ? 0 : stack.peek() + 1;
				int right = i;
				int currentArea = height[top] * (right - left);
				if (currentArea > maxArea)
					maxArea = currentArea;
			}
		}

		while (!stack.isEmpty()) {
			int top = stack.pop();
			int left = stack.isEmpty() ? 0 : stack.peek() + 1;
			int right = i;
			int currentArea = height[top] * (right - left);
			if (currentArea > maxArea)
				maxArea = currentArea;
		}

		return maxArea;
	}
}