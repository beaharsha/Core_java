package com.test.thread;

public class Show {

	public void show(String name) {

		synchronized (Show.class) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("name " + i);
			}
		}

	}

}
