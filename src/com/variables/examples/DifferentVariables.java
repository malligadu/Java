package com.variables.examples;

public class DifferentVariables {
	int x; // default value of integer is 0
	static int y; // memory location of static is method Area at the time of class 
	 //loading
	boolean flag; // default value of boolean value is false
	
	public static void method() {
		int z=25; // local variables by default final variables.
		System.out.println("local variable z value is: "+z);
	}

	public static void main(String[] args) {
		 DifferentVariables dv=new DifferentVariables();
		 System.out.println("instance  x value is: "+dv.x);
		 System.out.println("static variable vlaue y: "+DifferentVariables.y);
		 System.out.println("instance variable flag value is: "+dv.flag);
		 method();

	}

}
