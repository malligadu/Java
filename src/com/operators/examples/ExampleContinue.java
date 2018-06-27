package com.operators.examples;

public class ExampleContinue {

	public static void main(String[] args) {
		
		String s="mallikarjunarao thulluru";
		int length=s.length();
		int count=0;
		  for(int i=0;i<length;i++) {
			 if(s.charAt(i) != 'u')
				 continue;
			 count++;
				  
		  }
			
			
			
		
		System.out.println(" u repeated ---->"+count+" times:");
		

	}

}
