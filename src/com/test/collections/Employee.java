package com.test.collections;

public class Employee 
//implements Comparable<Employee>
{
	
	private Integer empId;
	private String name;
	
	private String address;
	private float salary;
	
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
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
	
	/*@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}*/
	
}
