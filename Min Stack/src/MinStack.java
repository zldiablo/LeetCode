import java.util.*;

class MinStack {
	Stack<Element> stack;

	public MinStack() {
		stack = new Stack<Element>();
	}

	public void push(int x) {
		if (stack.isEmpty()) {
			stack.push(new Element(x, x));
		} else {
			stack.push(new Element(x, Math.min(x, stack.peek().min)));
		}
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek().value;
	}

	public int getMin() {
		return stack.peek().min;
	}
}

class Element
{
    final int value;
    final int min;
    Element(final int value, final int min)
    {
        this.value = value;
        this.min = min;
    }
}
