package com.test.map;

import java.util.HashMap;
import java.util.Map;

public class EmployeMap {

	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<>();
		
		Employee e1 = new Employee(101,  "harsha");
		Employee e2 = new Employee(102,  "Bhaji");
		Employee e3 = new Employee(103,  "Raj");
		Employee e4 = new Employee(101,  "harsha");
		
		map.put(e1, 1);
		map.put(e2, 2);
		map.put(e3, 3);
		map.put(e4, 4);
		System.out.println(map);
	}
}
