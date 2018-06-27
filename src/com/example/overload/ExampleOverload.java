package com.example.overload;

public class ExampleOverload {
	
	private void method(int a) {
		System.out.println("method in integer");
	}
	
	private void method(long b) {
		System.out.println("method in long");
	}
	private void method(Integer c) {
		System.out.println("method in Wrapper class");
	}
	private void method(float d) {
		System.out.println("method in float");
	}

	public static void main(String[] args) {
		ExampleOverload eo=new ExampleOverload();
		eo.method(new Integer(2));
        eo.method(23f);
        eo.method(4L);
	}

}
