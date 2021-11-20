package test2;
import java.util.*;

//time complexity O(1)
//it takes o(n) space since every node has to remember min value

class StackMinUsingNode {

	Stack<Node> s;
	
	class Node {
		int value;
		int min;
		public Node(int value, int min) {
			this.value=value;
			this.min=min;
		}
	}

	public StackMinUsingNode() {
		this.s = new Stack<Node>();
	}
	
	public int pop() {
		return this.s.pop().value;
	}
	
	public int peek() {
		return this.s.peek().value;
	}
	
	public int getMin() {
		return this.s.peek().min;
	}
	
	public void push(int i) {
		System.out.println(i+" is inserted");
		if(s.isEmpty()) {
			s.push(new Node(i,i));
		}else {			
			s.push(new Node(i,Math.min(i, this.s.peek().min)));
		}
	}
	
	public static void main(String[] args) {
		StackMinUsingNode stack = new StackMinUsingNode();
		stack.push(4);
		System.out.println(stack.getMin());
		
		stack.push(3);
		System.out.println(stack.getMin());
		
		stack.push(5);
		System.out.println(stack.getMin());
		
		stack.peek();
		System.out.println(stack.getMin());
		
		stack.pop();
		System.out.println(stack.getMin());
		
		stack.pop();
		System.out.println(stack.getMin());
	}
}
