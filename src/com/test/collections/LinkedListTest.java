package com.test.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("sachin");
		list.add("Bathi");
		list.add("raj");
		
		System.out.println(list.get(2));
	}
}
