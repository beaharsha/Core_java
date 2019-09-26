package com.test.thread.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		ExecutorService service = Executors.newFixedThreadPool(5);
		ExecutorService service = Executors.newCachedThreadPool();	
//		ExecutorService service = Executors.newSingleThreadExecutor();
		// executing runnable
		/*for(int i = 1 ; i<=10 ; i++) {
			Task task = new Task("Task "+i);
			service.execute(task);
		}*/
		Future<Integer> future = null;
		for(int i = 1 ; i<=10 ; i++) {
		CallableTask task= new CallableTask();
		  future = service.submit(task);
		  System.out.println(future.get());
	}
		service.shutdown();
//		service.execute(new Task("Task 11"));
		
	}

}
