package com.test.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "sachin", "Tendulkar", "1234");
		Employee e2 = new Employee(102, "Dravid", "Rahul", "1234");
		Employee e3 = new Employee(103, "Laxman", "VVS", "1234");
		
		EmpRepository empRepo1 = EmpRepository.getInstance();
		empRepo1.saveEmp(e1);
		empRepo1.saveEmp(e2);
		empRepo1.saveEmp(e3);
		
		EmpRepository empRepo2 = EmpRepository.getInstance();
		
		System.out.println(empRepo2.getEmp("sachin"));
	}
}
