package com.test.thread;

public class TaskThread extends Thread{

	
	@Override
	public void run() {
		Thread.currentThread().setName("Task");
		for(int i = 1 ; i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("start method");
	}
	
}
