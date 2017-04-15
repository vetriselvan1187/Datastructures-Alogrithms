

import java.util.Stack;

public class ReverseStack {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		Stack<Integer> reversedStack = reverse(stack);
		printStack(reversedStack);
	}

	static void printStack(Stack<Integer> stack) {
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}


	static Stack reverse(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return stack;
		}
		int temp = stack.pop();
		reverse(stack);
		insertAtBottom(stack, temp);
		return stack;
	}

	private static void insertAtBottom(Stack<Integer> stack, int x) {
		if(stack.isEmpty()) {
			stack.push(x);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, x);
		stack.push(temp);
	}
}
