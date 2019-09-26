package com.test.oops;

public class SaveEmployee {

	int empId = 100;
	public void save() {
		System.out.println("save in excel");
	}
	public void show() {
		System.out.println("showing data of employee ");
	}
	
	public SaveEmployee() {
		System.out.println("Parent class");
	}
	public SaveEmployee(int empId) {
		this.empId=empId;
		System.out.println("Parent class: empid "+empId);
	}
}
