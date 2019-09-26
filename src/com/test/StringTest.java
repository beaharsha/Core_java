package com.test;

public class StringTest {

	public static void main(String[] args) {
		
		String s1 = "sachin";
		String s2 = new String("sachin");
		String s3 = "SACHIN";
/*		System.out.println(s1 == s2);
				System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1 == s3);*/
		/*
		String s4 = s2.intern();
		
		System.out.println(s4);
		System.out.println(s2 ==s4 );
		System.out.println(s4 == s1);*/
		
		/*String csvDate = "sachin mumbai 12345";
		
		String[] slipttedValues = csvDate.split(" ");
		System.out.println(slipttedValues);
		
		for(String value : slipttedValues) {
			System.out.println(value);
		}
		
		System.out.println(s1.length());*/
		
/*		String s = "INdia";
		System.out.println(s.toLowerCase());*/
		String s = " Hello World Hello World Hello World! ";
		char[] ch = s.toCharArray();
		/*char[] ch = s.toCharArray();
		for(char c : ch) {
			System.out.println(c);
		}*/
//		System.out.println(s.startsWith("sa"));
		/*System.out.println("char "+ch);
		String sub = s.substring(2);
		System.out.println(sub);
		String subWithStartEnd = s.substring(2,7);
		System.out.println(subWithStartEnd);
		System.out.println(s);
		System.out.println(s.replace('l', 'm'));
		System.out.println(s.replaceAll("World", "Harsha"));
		System.out.println(s.replaceFirst("World", "Harsha"));
		*/
		System.out.println(s.length());
		String trim= s.trim();
		System.out.println(trim.length());
	}
}
