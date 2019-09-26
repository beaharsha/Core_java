package com.test.clone;


public class CloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		
		Deparment deparment = new Deparment();
		deparment.setDepId(10);
		deparment.setDepName("Telecomm"); 
		Employee e1 = getEmployee(deparment);
		
		Employee e2 = (Employee) e1.clone();
		
		System.out.println(e1 == e2);
		System.out.println(deparment == e2.getDeparment());
		
		
		
	}
	
	public static Employee getEmployee(Deparment deparment) {
		
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("VVS");
		employee.setAddress("Hyd");
		employee.setSalary(10000.0f);
		employee.setDeparment(deparment);
		
		
		return employee;
	}

}
