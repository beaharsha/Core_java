package com.test.oops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.test.exception.UserNotFoundException;

public class Test {

	public static void main(String[] args)  {
		/*
		 * SaveEmployee se = new SaveEmployee(); // SaveEmployeeXml xml = new
		 * SaveEmployeeXml(); // xml.save();
		 * 
		 */
//		SaveEmployeeXml.m1();
		
		int a ,b,c;
		a = 10;
		b = 10;
		c =a /b;
		try {
		throw new UserNotFoundException("User Not found try with diff username");
		}
		catch(UserNotFoundException e) {
			System.out.println("inside ex");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
