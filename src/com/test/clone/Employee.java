package com.test.clone;

public class Employee implements Cloneable{
	
	private Integer id;
	private String name;
	private String address;
	private float salary;
	private Deparment deparment;
	
	
	public Deparment getDeparment() {
		return deparment;
	}
	public void setDeparment(Deparment deparment) {
		this.deparment = deparment;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee eClone = (Employee) super.clone();
		eClone.setDeparment((Deparment) eClone.getDeparment().clone());
		return eClone;
	}

}
