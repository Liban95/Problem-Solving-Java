package lab3;

import java.util.Stack;

public class reversedWords {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("The world");// stacks a string
		stack.push("is a great place");
		stack.push("Don't you think?");
		stack.push("end-of-input");
	
		while (!stack.isEmpty()){
		System.out.println(stack.pop());
		}
	}
	
}

