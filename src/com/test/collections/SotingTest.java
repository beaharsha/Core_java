package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SotingTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(101, "sachin"));
		list.add(new Employee(122, "dravid"));
		list.add(new Employee(103, "vvs"));
		list.add(new Employee(110, "zahir"));
		list.add(new Employee(105, "bhuvi"));
		System.out.println(list);

		// Collections.sort(list);
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});

		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpId().compareTo(o2.getEmpId());
			}

		});

		System.out.println(list);

		TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});
		employees.addAll(list);
		System.out.println("printing tree set ");
		System.out.println(employees);
		
		List<Employee> empFinal = Collections.unmodifiableList(list);
		empFinal.add(new Employee(101, "sachin"));
		Collections.reverse(list);
		System.out.println(list);
		
	}
	
}
