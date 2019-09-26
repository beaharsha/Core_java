package com.test.singleton;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class EmpRepository implements Serializable, Cloneable {

	private Map<String, Employee> mapRepo;
	private static EmpRepository empRepoInstance;

	// private const
	private EmpRepository() {
		mapRepo = new HashMap<String, Employee>();
	}

	public static synchronized EmpRepository getInstance() {

		if (empRepoInstance == null) {
			empRepoInstance = new EmpRepository();
		}
		return empRepoInstance;
	}

	public boolean saveEmp(Employee employee) {
		if (mapRepo.containsKey(employee.getFirstName())) {
			return false;
		}
		mapRepo.put(employee.getFirstName(), employee);
		return true;
	}

	public Employee getEmp(String userName) {
		if (mapRepo.containsKey(userName)) {
			return mapRepo.get(userName);
		}
		return null;
	}

	protected Object readResolve() {
		return empRepoInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
