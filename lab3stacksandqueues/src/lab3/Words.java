package lab3;

import java.util.Stack;

public class Words {
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("The world");// stacks a string
		printStack(stack);// prints the stack
		stack.push("is a great place. Don't");
		printStack(stack);
		stack.push("you think?");
		printStack(stack);
		stack.push("end-of-input");
		printStack(stack);

		stack.pop();//removes the top of the array and continues downwards
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		
		
		
	}

	private static void printStack(Stack<String> s) {
		if (s.isEmpty())//if stack is empty then prints "you have nothing" 
			System.out.println("\nYou have nothing in your stack!");
		else//else it prints the list
			System.out.printf("%s \n", s);
		

	}
}

