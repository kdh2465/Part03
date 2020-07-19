package pack04_collectionframework.sec04_StackAndQueue.EX01_StackMethod;

import java.util.LinkedList;
import java.util.Stack;

public class EX01_StackMethod {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		//#1. E push(E element)
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);

		//#2. E peek()
		System.out.println(stack.peek()); //7
		System.out.println(stack.size()); //4
		System.out.println();

		//#3. E search(Object o)
		System.out.println(stack.search(7)); //1
		System.out.println(stack.search(3)); //2
		System.out.println(stack.search(5)); //3
		System.out.println(stack.search(2)); //4
		System.out.println(stack.search(9)); //-1
		 
		//#4. E pop()
		System.out.println(stack.pop()); //7
		System.out.println(stack.pop()); //3
		System.out.println(stack.pop()); //5
		System.out.println(stack.pop()); //2
		System.out.println();

		//#5. boolean empty()
		System.out.println(stack.empty()); //true
		LinkedList l;
	}
}