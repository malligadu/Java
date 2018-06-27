package com.operators.examples;

public class ExampleOperators {

	public static void main(String[] args) {
		
		int i=3;
		 i++;
		 System.out.println(" post incerement i value is ====="+i);// i=4
		 ++i;
		 System.out.println("pre incerement i value "+i);// i=5
		 System.out.println("another pre increment i value "+(++i));//i=6
		 System.out.println("another post increment i value "+(i++));// i=7
		 System.out.println("i value "+i);

	}

}
