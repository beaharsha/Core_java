package com.test.thread;

public class TaskShowThread implements Runnable{
	
	Show show;
	String name;
	public TaskShowThread(Show show, String name) {
		super();
		this.show = show;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("started by "+name);
		show.show("name");
	}

}
