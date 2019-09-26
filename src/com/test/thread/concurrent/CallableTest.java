package com.test.thread.concurrent;

public class CallableTest {
	public static void main(String[] args) throws Exception {
		CallableTask task = new CallableTask();
		System.out.println(task.call());
	}
}
