package com.operators.examples;

public class ExampleLabeledContinue {

	public static void main(String[] args) {
		
		/*String word="mallikarjunarao thulluru malli";
		String searchWord="malli";
		
		int max=word.length()-searchWord.length();
		boolean flag=false;
		
		test:for(int i=0;i<max;i++) {
			int n=searchWord.length();
			int j=i;
			int k=0;
			
			while(n-- !=0) {
				if(word.charAt(j++)!=searchWord.charAt(k++)) {
					continue test;
				}
			}
			
			flag=true;
			break test;
			
		}
		System.out.println(flag ? "Found" : " not found:");*/
		
		
		
		/*String word="mallikarjunarao tulluru";
		
		int length=word.length();
		 
		int count=0;
		
		for(int i=0;i<length;i++) {
			if(word.charAt(i)!='r')
				continue;
			count++;
			
		}
		
		 System.out.println("r repeated ---> "+count+" times:");*/
		
		
		String word="mallikarjunarao thulluru rao malli thulluru rao";
        String searchword="malli";
        
        int count=0;
        if(word.contains(searchword)) {
        	count++;
        }
        
		System.out.println("search word repeated ---> "+count+" times:" );
		
		
		
		
		
	}

}