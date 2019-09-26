package com.test.thread;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TaskThread thread1 = new TaskThread(); thread1.start(); // thread1.run();
		 * 
		 * }
		 */

		TaskRunnable runnable1 = new TaskRunnable("child1");
		TaskRunnable runnable2 = new TaskRunnable("child2");
		runnable1.mainThread = Thread.currentThread();
		Thread thread1 = new Thread(runnable1);
		
		thread1.start();
//		thread1.setPriority(Thread.MAX_PRIORITY);
		Thread thread2 = new Thread(runnable2);
		
//		thread2.start();
//		thread2.yield();
//		thread.setPriority(Thread.MAX_PRIORITY);
//		Thread.yield();
//		thread1.join(1);
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
//		thread.start();
	}
}
