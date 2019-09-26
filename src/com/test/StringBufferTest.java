package com.test;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer(); //16+ char -> (cap +1) * 2
		sb1.append("sachin");
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("sachin");
				
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		/*
		String --> equals --> content comparision
		StringBuffer --> equals -> reference comparision
		Object --> equals --> reference comparision
		*/
	}
}
