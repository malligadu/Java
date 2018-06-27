package com.operators.examples;

class Parent{
	
}

class Child extends Parent implements MyInterface{
	
}
interface MyInterface{
	
}
public class ExampleInstance {

	public static void main(String[] args) {
		
       Parent obj1=new Parent();
       Parent obj2=new Child();
       
       /*System.out.println(obj1 instanceof Parent);
       System.out.println(obj2 instanceof Child);
       System.out.println(obj1 instanceof Child);
       System.out.println(obj2 instanceof Parent);	
       System.out.println(obj2 instanceof MyInterface);
       System.out.println(obj1 instanceof MyInterface);*/
       System.out.println(obj1 instanceof Object);
       System.out.println(null instanceof Object);
	}

}
