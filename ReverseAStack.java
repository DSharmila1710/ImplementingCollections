package Automation.test;

import java.util.*;

public class ReverseAStack {

	private static Stack<Integer> reverseStack(Stack<Integer> original){
		Stack<Integer> stack = new Stack<Integer>();
		while(!original.isEmpty()) {
			stack.push(original.pop());
		}
		return stack;
		
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.add(6);
		System.out.println(reverseStack(stack));

	}

}
