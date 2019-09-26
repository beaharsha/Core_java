package com.test;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer ii = 500;
		ii = 600;
		System.out.println(ii);
		/*Integer i = 500;
		int in = Integer.MIN_VALUE;
		System.out.println(in);*/
		
		Integer i  = new Integer("100");
		byte b = i.byteValue();
		System.out.println(i);
		
		String s =i.toString();
		System.out.println(s);
		String num = "1000";
		int numStringToInt = Integer.parseInt(num);
		System.out.println(numStringToInt);
		
		int numWraper = i.intValue();
	}

}
