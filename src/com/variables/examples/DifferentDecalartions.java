package com.variables.examples;

public class DifferentDecalartions {
	
	static int _malli;
	 static float $value_;
	 static final int VALUE=25;
	
	 int x=0x52;

	public static void main(String[] args) {
		
     System.out.println(_malli);
     System.out.println($value_);
     System.out.println("final variable value is: "+VALUE);
    //DifferentVariables.VALUE=50;
    System.out.println("modified value "+DifferentDecalartions.VALUE);
    DifferentDecalartions dd=new DifferentDecalartions();
    System.out.println("print x value is:"+dd.x);
	}

}
