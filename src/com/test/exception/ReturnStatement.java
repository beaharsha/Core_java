package com.test.exception;

public class ReturnStatement {

	public static void main(String[] args) {
		System.out.println(check(10,0));
	}
	
	public static int check(int a, int b) {
		int i = -10;
		try {
			return a/b;
		}
		catch(ArithmeticException e) {
			return 0;
		}
		finally {
			return i;
		}
	}
}


