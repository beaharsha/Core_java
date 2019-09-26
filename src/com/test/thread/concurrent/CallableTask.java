package com.test.thread.concurrent;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int total = 0;
		
		for(int i=0;i<=50;i++) {
			total += i; // totatl = total +i
		}
		return total;
	}
}
