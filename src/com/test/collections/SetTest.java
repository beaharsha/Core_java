package com.test.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet(20, 0.9f);
		
		set.add("Harsha");
		System.out.println("Harsha".hashCode() );
		set.add("Raja");
		System.out.println("Raja".hashCode());
		set.add("Bhaji");
		System.out.println("Bhaji".hashCode() % 15);
		set.add("sachin");
		System.out.println("sachin".hashCode() );
		set.add("sachin");
		System.out.println("sachin".hashCode() );
		
		
		System.out.println(set);

		for (String s : set) {
			System.out.println(s);
		}

		Set<String> set2 = new TreeSet<>();
		set2.add("Harsha");
		set2.add("Raja");
		set2.add("Bhaji");
		set2.add("sachin");
		set2.add("sachin");
		System.out.println(set2);
		System.out.println(set.isEmpty());
		
	}
}
