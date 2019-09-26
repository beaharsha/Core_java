package com.test.newInstance;

import java.util.Scanner;

public class ClazzTest {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println("enter input");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		ClazzA a = null;
		ClazzB b = null;
		if (input.equals("a")) {
			a = (ClazzA) Class.forName("com.test.newInstance.ClazzA").newInstance();
		} else if (input.equals("b")) {
			b = (ClazzB) Class.forName("com.test.newInstance.ClazzB").newInstance();
		}
		
		if(a != null ) {
			a.method1();
		}
		if(b != null) {
			b.method1();
		}
	}
}
