package com.test.thread;

public class TaskRunnable implements Runnable{

	static Thread mainThread;
	private String name;
	public TaskRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {

/*		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*for(int i = 1 ; i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+" "+i);
		}*/
		
	}
}
