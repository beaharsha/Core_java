package com.test.thread.concurrent;

public class Task implements Runnable{

	private String name;

	public Task(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 1 ; i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("name "+name + " : "+i);
		}
		
	}
	
}
