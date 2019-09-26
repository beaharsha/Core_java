package com.test.map;

public class Employee {
	
	private int empId;
	private String name;
	
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return empId + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee) {
			Employee target = (Employee) obj;
			if(target.getEmpId() == this.empId && target.getName().equals(this.name)) {
				return true;
			}
		}
		return false;
		
	}
	
	
}
