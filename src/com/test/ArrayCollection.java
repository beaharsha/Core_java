package com.test;

public class ArrayCollection {

	private int arrayLength =10;
	private int size=0;
	private String names[] = null;
	
	
	public ArrayCollection() {
		System.out.println("default cons" + arrayLength );
		names = new String[arrayLength];
	}
	
	public ArrayCollection(int arrayLength) {
		System.out.println(arrayLength);
		this.arrayLength = arrayLength;
		names = new String[arrayLength];
	}
	
	public boolean add(String name) {
		
		if(size <= arrayLength - 1) {
			names[size] = name;
			size++;
			return true;
		}
		return false;
	}
	protected void show() {
		
		for(int i = 0 ; i<=size-1;i++) {
			System.out.println(names[i]);
		}
		
	}
	
	public boolean remove(String name) {
		
		for(int i = 0 ; i<size;i++) {
			if(names[i].equals(name)) {
				for(int j = i; j<size; j++) {
					names[j] = names[j+1];
				}
				size--;
				return true;
			}
			
		}
		return false;
	}
	public boolean insert(int index, String name) {
		if(index <= 0 || index > arrayLength) {
			return false;
		}
		else {
			for(int j=size;j>index;j--) {
				System.out.println("j+1 = "+j+1+" "+ names[j+1] + " j = " +j +" " +names[j] );
				names[j] = names[j-1];
			}
			names[index] = name;
			size++;
			return true;
		}
	}
	
	
	
	
}
