package com.test.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("sachin");
		list.add("zahir");
		
		System.out.println(list);
		
		list.add(1, "Dravid");
		list.add("sachin");
		list.add("sehwag");
		list.add("rayudu");
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.contains("sachin3"));
		String s = list.get(0);
		System.out.println(list.get(2));
		
		List<String> list2 = new ArrayList<>();
		list2.addAll(list);
		list2.removeAll(list);
		list2.add("kolhi");
		System.out.println(list2);
		
		List<Integer> numList = Arrays.asList(100,200,300,400,500);
		System.out.println("Number list :  "+numList);
		
		// Iterator
		int i = 0;
		Iterator<String> itr = list.iterator();
		System.out.println("Iterating using iterator object");
		while(itr.hasNext()) {
			
			String ss = itr.next();
			
			if("sachin".equals(ss)) {
//				list.add(i, "VVS");
				itr.remove();
//				System.out.println("found at "+i);
			}
//			System.out.println("values in list "+ss);
			i++;
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		/*for(int j = 0; j< list.size();j++) {
			System.out.println(list.get(j));
		}*/
	}

}
