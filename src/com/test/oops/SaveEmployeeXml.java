package com.test.oops;

public class SaveEmployeeXml extends SaveEmployee{
	
	public SaveEmployeeXml() {
		super(1000);
		System.out.println("Child constructor");
		
	}
	int empId = 101;
	@Override
	public void save() {
		// TODO Auto-generated method stub
		/*super.save();*/
		System.out.println("save employee in XML");
		/*SaveEmployee se = new SaveEmployee();
		se.show();*/
		this.empId = 500;
		
		super.show();
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show in xml format");
	}
	
	public static void m1() {
		System.out.println("I'm static method");
	}
	

}
