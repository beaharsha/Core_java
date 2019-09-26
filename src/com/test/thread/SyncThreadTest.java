package com.test.thread;

public class SyncThreadTest {
public static void main(String[] args) {

	Show show = new Show();
	TaskShowThread thread = new TaskShowThread(show, "t1");
	Thread t1 = new Thread(thread);
	t1.start();
	Thread t2 = new Thread(new TaskShowThread(show, "t2") );
	t2.start();
	/*for(int i = 1 ; i<10 ;i++) {
		System.out.println("main "+i);
	}*/
}
}
