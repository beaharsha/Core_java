package com.test.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PhoneBookMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("sachin", 1234560);
		map.put("dravid", 1234567);
		map.put("VVS", 1234560);
		map.putIfAbsent("sachin", 123456789);
		map.putIfAbsent("Gambir", 1237856);
		
//		System.out.println(map); //[key=value]
		
//		System.out.println("get method "+map.get("sachin"));
		
		
/*		 
		map.clear();
		System.out.println(map);
		
*/		
//		System.out.println(map.containsKey("VVSdad"));
//		System.out.println(map.containsValue(1234560));
		map.replace("Gambir", 1237856, 123785689);
//		System.out.println(map);
		
//		System.out.println(map.size());
		
		System.out.println(map.get("dravid"));
		Set<String> setKeys = map.keySet();
		
		for(String s : setKeys) {
			System.out.println(s+" "+map.get(s));
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("Iterating using entryset");
		for(Entry<String , Integer> entry : entrySet) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	}

}
