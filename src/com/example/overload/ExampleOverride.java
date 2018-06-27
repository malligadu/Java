package com.example.overload;

class Parent{
	void methodA() {
		System.out.println("parent method A");
	}
	void methodB() {
		System.out.println("parent method B");
	}
}
class Child extends Parent{
	void methodA() {
		super.methodA();
		System.out.println("child class method A");
	}
	void methodC() {
		System.out.println("child class method C");
	}
}



public class ExampleOverride {

	public static void main(String[] args) {
		Child p=new Child();
		p.methodA();
		p.methodB();
		p.methodC();

	}

}
