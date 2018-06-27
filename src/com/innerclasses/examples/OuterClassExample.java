package com.innerclasses.examples;

public class OuterClassExample {
	
	public int x=0;// instance variable of outer class
	
	class InnerClass{
		private int x=11; // instance variable of inner class
		
		public void method(int x) {
			System.out.println(" local variable value: ---> "+x);
			System.out.println("inner instance variable value ---> "+ this.x);
			System.out.println("outer instance variable value ---> "+OuterClassExample.this.x);
		}
		
	}
	
	public static void main(String... args) {
		OuterClassExample oce=new OuterClassExample();
		OuterClassExample.InnerClass ic=oce.new InnerClass();
		ic.method(23);
	}

}
