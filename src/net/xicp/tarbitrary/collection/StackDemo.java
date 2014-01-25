package net.xicp.tarbitrary.collection;

import java.util.Stack;

public class StackDemo {

	/**Stack继承自vector,则它是同Vector同一级别的老辈容器。
	 * 它实现了栈的功能，先进后出。
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("C");
		stack.push("D");
		stack.add("B");
		stack.push("E");
		
		
		System.out.println(stack.pop());//返回栈顶元素并移除
		System.out.println(stack.pop());
		System.out.println(stack.peek());//仅返回栈顶元素，但并不移除。
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//如果栈为空则调用此句会抛异常。
		//System.out.println(stack.pop());
	}

}
