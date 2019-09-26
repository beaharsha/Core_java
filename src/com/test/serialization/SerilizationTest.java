package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "C:\\Users\\lenovo\\Desktop\\Java\\";
		Employee e = getEmployee();
		
		FileOutputStream fos  = new FileOutputStream(path+"employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("done serialization");
		
		FileInputStream fis = new FileInputStream(path+"employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee employee = (Employee) ois.readObject();
		System.out.println(employee);
	}
	
	public static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("VVS");
		employee.setAddress("Hyd");
//		employee.setSalary(10000.0f);
		
		return employee;
	}

}
