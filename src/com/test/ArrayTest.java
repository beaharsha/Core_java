package com.test;

public class ArrayTest {
public static void main(String[] args) {

	ArrayCollection arrays = new ArrayCollection();
	ArrayCollection arrays1 = new ArrayCollection(50);
	
	
	arrays.add("sachin");
	arrays.add("zahir");
	arrays.add("sehwag");
	arrays.add("dhoni");
	arrays.add("bhuvi");
	arrays.add("kohli");
	
	arrays.show();
	System.out.println("----------------------");
	arrays.remove("dhoni");
	arrays.show();
	System.out.println("-------------------------");
	arrays.insert(3, "rayudu");
	System.out.println("----------------------------");
	arrays.show();
}

public void m1() {
	ArrayCollection arrays = new ArrayCollection();
}
}
