package com.test.collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.add("sachin");
		stack.add("dravid");
		stack.add("bhuvi");
		
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		stack.push("zahir");
		System.out.println(stack);
		System.out.println(stack.search("sachin"));
	}

}
