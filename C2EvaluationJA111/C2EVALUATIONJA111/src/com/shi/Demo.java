package com.shi;

public class Demo {
	public static void main(String[] args) {
		StudentBean s2 = new StudentBean(121, "Ram", "xyz", 500);
		System.out.println("S1 details: ");
		System.out.println("S2 detils using getter method: ");
		System.out.println("Roll is: "+s2.getRoll());
		System.out.println("Name is: "+s2.getName());
		System.out.println("Address is: "+s2.getAddress());
		System.out.println("Marks is: "+s2.getMarks());
	}
}
