import java.util.*;
public class StackImplementation {
	private static Deque<Integer> stack = new ArrayDeque<Integer>();
	
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		System.out.println(stack);
		pop();
		pop();
		pop();
		pop();
		pop();
		System.out.println(stack);
	}

	private static void pop() {
		if(stack.isEmpty())
			System.out.println("No element in stack");
		else stack.pollLast();
	}

	private static void push(int number) {
		stack.addLast(number);
	}
}
