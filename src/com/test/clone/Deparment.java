package com.test.clone;

public class Deparment implements Cloneable{
	
	private int depId;
	private String depName;
	/**
	 * @return the depId
	 */
	public int getDepId() {
		return depId;
	}
	/**
	 * @param depId the depId to set
	 */
	public void setDepId(int depId) {
		this.depId = depId;
	}
	/**
	 * @return the depName
	 */
	public String getDepName() {
		return depName;
	}
	/**
	 * @param depName the depName to set
	 */
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
